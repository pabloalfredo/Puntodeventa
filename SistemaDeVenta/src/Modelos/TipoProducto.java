package Modelos;

public class TipoProducto {

	private int idTipoProducto;
	private String Descripcion;
	
	public TipoProducto(int idTipoProducto, String Descripcion){
	
		this.idTipoProducto = idTipoProducto;
		this.Descripcion = Descripcion;
	}
	
	public int getIdTipoProducto() {
		return idTipoProducto;
	}
	public String getDescripcion() {
		return Descripcion;
	}



}
