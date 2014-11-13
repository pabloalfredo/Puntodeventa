package Clases;

import java.sql.*;

import javax.swing.JOptionPane;
public class DBLoguin {
	
	public void Acceder(String usuario, String clave){
		
		Connection conexion = null;
		Statement consulta = null;
		ResultSet tabla = null;
		
		try{
			
			Class.forName("Com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdlogin","root", "");
			consulta = conexion.createStatement();
			tabla = consulta.executeQuery("SELECT * FROM bdlogin WHERE usuario='"+usuario+"' AND password='"+ clave+"'");
			
			if(tabla.next()){
				JOptionPane.showMessageDialog(null,"Datos Correctos");
			}
			else{
				JOptionPane.showMessageDialog(null, "Usuario y/o Contrasena Incorrectos");
				
			}
				
		}
		catch(ClassNotFoundException | SQLException e){
			e.getMessage();
		}
		
		
	}

}
