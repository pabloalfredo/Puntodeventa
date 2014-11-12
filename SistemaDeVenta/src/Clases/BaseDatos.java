package Clases;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.*;

public class BaseDatos {
	
	private static Connection con; //Variable tipo conexion para retornar una conexion
    private static ResultSet rs = null;//para acceder a los resultados de las consultas
    private static PreparedStatement pst = null;//Objeto para ejecutar las consultas
	
	
	//// metodo para obtener la conexion
	@SuppressWarnings("unused")
	private static Connection getConexion() throws ClassNotFoundException, SQLException
	{
	      Class.forName("com.mysql.jdbc.Driver");
	      con  = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/bdlogin","root", "");
		  return con;							
	}
	
}
