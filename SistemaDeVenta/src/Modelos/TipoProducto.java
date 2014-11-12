package Modelos;

public class TipoProducto {

	private int idTipoProducto;
	
	private String Descripcion;
	
	/*public TipoProducto(int idTipoProducto, String Descripcion){
	
		this.idTipoProducto = idTipoProducto;
		this.Descripcion = Descripcion;
	}
	*/
	
	public TipoProducto(){
		
		
	}
	
	
	
	
	public int getIdTipoProducto() {
		return idTipoProducto;
	}
	public String getDescripcion() {
		return Descripcion;
		
	}
	
	public void setIdTipoProducto(int idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}



}
