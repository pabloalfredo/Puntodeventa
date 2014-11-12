package Clases;

import java.awt.Component;
import java.awt.Window;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;

import Formularios.frmPrincipal;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class BaseDatos  extends JFrame{
	
	private static Connection con; //Variable tipo conexion para retornar una conexion
    private static ResultSet rs = null;//para acceder a los resultados de las consultas
    private static PreparedStatement pst = null;//Objeto para ejecutar las consultas
	
	
	//// metodo para obtener la conexion
	private static Connection getConexion() throws ClassNotFoundException, SQLException
	{
	      Class.forName("com.mysql.jdbc.Driver");
	      con  = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/bdlogin","root", "");
		  return con;							
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	
	//metodo de autenticacion de usuarios
	public static void autenticarUsuario(String nombre, String pass ) throws SQLException, ClassNotFoundException
	{
	   
	   String sql = "SELECT * FROM bdlogin WHERE usuario = '"+nombre+"' AND  password = '"+pass+"'  ";
	   pst = (PreparedStatement)getConexion().prepareStatement(sql);
	   rs = (ResultSet) pst.executeQuery();

	   while(rs.next())
	    {
		  
		   String tipo = rs.getString("Tipo");
		    System.out.println(tipo);
			frmPrincipal menu = new frmPrincipal(tipo);
			menu.setVisible(true);
			
	    }
		 

	 }
	    
}


