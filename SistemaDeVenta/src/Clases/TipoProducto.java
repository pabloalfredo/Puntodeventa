package Clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;



public class TipoProducto {
	
	public static void insertarProducto(Producto producto) throws SQLException, ClassNotFoundException
	{
		
		    String sql = "INSERT INTO Producto (Nombre, Precio, Tipo) values (?,?,?)";//Consulta para registrar un producto
	        PreparedStatement pst = getConexion().prepareStatement(sql);
	        
	        pst.setObject(1, producto.getNombre());
	        pst.setObject(2, producto.getPrecio());
	        pst.setObject(3, producto.getTipo());
	       

	        pst.executeUpdate();
		
	}

	

}
