package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelos.TipoProducto;


public class DB {
	
	private static Connection con; //Variable tipo conexion para retornar una conexion
    private static ResultSet rs = null;//para acceder a los resultados de las consultas
    private static PreparedStatement pst = null;//Objeto para ejecutar las consultas
	
	
	
	private static Connection getConexion() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver");
        Connection unaConexion  = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/bdlogin","root", "");
		return con;							
	}
	
	
	/// insertar tipo producto
	public static void insertarProducto(TipoProducto producto) throws SQLException, ClassNotFoundException
	{
		
		    String sql = "INSERT INTO Producto (Nombre, Precio, Tipo) values (?,?,?)";//Consulta para registrar un producto
	        PreparedStatement pst = getConexion().prepareStatement(sql);
	        
	        pst.setObject(1, producto.getDescripcion());
	       
	       

	        pst.executeUpdate();
		
	}

}
