
package Clases;

import javax.swing.JOptionPane;

import Modelos.TipoProducto;
import Formularios.frmTipoProducto;;

public class mtdTipoProducto {
	

	public void AgregarTipoProducto (){
		
		TipoProducto Descripcion = new TipoProducto();
		String Descri = Descripcion.getDescripcion();
		
		//JOptionPane.showInputDialog(Descripcion.getDescripcion(), "Mensaje");
		JOptionPane.showConfirmDialog(null, Descri, 
		"Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		/*
		String sql ="insert into categorias (Descripcion) value (?)";
		
        BaseDatos conn = new BaseDatos();
        conn.open();
        conn.execute(sql);
        conn.close();
		*/
	}

	
}
