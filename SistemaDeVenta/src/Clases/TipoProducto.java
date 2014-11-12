package Clases;

public class TipoProducto {

		private int IDTipoProducto;
		private String Descripcion;
		
		
		public TipoProducto(int IDTipoProducto, String Descripcion){
			this.IDTipoProducto = IDTipoProducto;
			this.Descripcion = Descripcion;
		}
		
		public int getIDTipoProducto() {
			return IDTipoProducto;
		}

		public void setIDTipoProducto(int iDTipoProducto) {
			IDTipoProducto = iDTipoProducto;
		}

		public String getDescripcion() {
			return Descripcion;
		}

		public void setDescripcion(String descripcion) {
			Descripcion = descripcion;
		}
		
		
}
