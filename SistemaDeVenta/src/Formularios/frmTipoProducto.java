package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmTipoProducto {

	private JFrame frmAgregarTipoDe;
	private JTextField IdTipoProducto;
	private JTextField Descripcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTipoProducto window = new frmTipoProducto();
					window.frmAgregarTipoDe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmTipoProducto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgregarTipoDe = new JFrame();
		frmAgregarTipoDe.setResizable(false);
		frmAgregarTipoDe.setTitle("Agregar Tipo de Producto");
		frmAgregarTipoDe.setBounds(100, 100, 298, 233);
		frmAgregarTipoDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgregarTipoDe.getContentPane().setLayout(null);
		
		JLabel lblAgregarTipoProducto = new JLabel("Agregar Tipo Producto");
		lblAgregarTipoProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAgregarTipoProducto.setBounds(61, 0, 169, 24);
		frmAgregarTipoDe.getContentPane().add(lblAgregarTipoProducto);
		
		JLabel lblNewLabel = new JLabel("ID ");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel.setBounds(28, 54, 55, 16);
		frmAgregarTipoDe.getContentPane().add(lblNewLabel);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblDescripcion.setBounds(28, 96, 76, 16);
		frmAgregarTipoDe.getContentPane().add(lblDescripcion);
		
		IdTipoProducto = new JTextField();
		IdTipoProducto.setBounds(114, 48, 122, 28);
		frmAgregarTipoDe.getContentPane().add(IdTipoProducto);
		IdTipoProducto.setColumns(10);
		
		Descripcion = new JTextField();
		Descripcion.setColumns(10);
		Descripcion.setBounds(114, 90, 122, 28);
		frmAgregarTipoDe.getContentPane().add(Descripcion);
		
		final JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(btnAceptar, IdTipoProducto.getText(), "agregado correctamente", 0);
			}
		});
		btnAceptar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnAceptar.setIcon(new ImageIcon(frmTipoProducto.class.getResource("/recursos/frmprincipal/Aceptar (2).png")));
		btnAceptar.setBounds(28, 143, 107, 38);
		frmAgregarTipoDe.getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(frmTipoProducto.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
		btnCancelar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnCancelar.setBounds(145, 143, 114, 38);
		frmAgregarTipoDe.getContentPane().add(btnCancelar);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
