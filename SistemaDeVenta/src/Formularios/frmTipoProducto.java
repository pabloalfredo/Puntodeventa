package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import Clases.mtdTipoProducto;
import Modelos.TipoProducto;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmTipoProducto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtDescripcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTipoProducto frame = new frmTipoProducto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmTipoProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAgregarTipoDe = new JLabel("Agregar Tipo de Producto");
		lblAgregarTipoDe.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblId = new JLabel("ID");
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		
		final JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//frmTipoProducto textoTextfield = new frmTipoProducto();
				
				//String Descripcion = textoTextfield.obtenerDescripcionTipoProducto();
				
				JOptionPane.showMessageDialog(btnAceptar,"Eggs are not supposed to be green.",null, 1);
				
				/*
				TipoProducto producto = new TipoProducto();
				producto.setDescripcion(txtDescripcion.toString());
				
				//mtdTipoProducto mensaje = new mtdTipoProducto();
				//mensaje.AgregarTipoProducto();
				
				String Descri = producto.getDescripcion();
				
				*/
				
			}
		});
		
		
		
		
		
		JButton btnCancelar = new JButton("Cancelar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescripcion)
						.addComponent(lblId))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDescripcion, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
					.addGap(111))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(58)
					.addComponent(btnAceptar)
					.addGap(66)
					.addComponent(btnCancelar)
					.addContainerGap(92, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(62)
					.addComponent(lblAgregarTipoDe)
					.addContainerGap(104, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAgregarTipoDe)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescripcion)
						.addComponent(txtDescripcion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnAceptar))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public String obtenerDescripcionTipoProducto() {
		
		return txtDescripcion.getText(); 
	}
}
