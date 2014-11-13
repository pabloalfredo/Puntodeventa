package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class frmProductos {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmProductos window = new frmProductos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmProductos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 12));
		frame.setBounds(100, 100, 423, 288);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblR = new JLabel("Agregar Productos");
		lblR.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblR.setBounds(130, 6, 184, 31);
		frame.getContentPane().add(lblR);
		
		JLabel lblId = new JLabel("Codigo");
		lblId.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblId.setBounds(18, 55, 55, 16);
		frame.getContentPane().add(lblId);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblDescripcion.setBounds(18, 91, 79, 16);
		frame.getContentPane().add(lblDescripcion);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblPrecio.setBounds(18, 130, 55, 16);
		frame.getContentPane().add(lblPrecio);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblTipo.setBounds(18, 158, 55, 16);
		frame.getContentPane().add(lblTipo);
		
		textField = new JTextField();
		textField.setBounds(99, 49, 122, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(99, 85, 223, 28);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(99, 124, 122, 28);
		frame.getContentPane().add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(99, 153, 122, 26);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Generar ");
		btnNewButton.setToolTipText("Generar un Codigo si el Producto no tiene Codigo");
		btnNewButton.setBounds(244, 49, 79, 28);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnModificar.setBounds(156, 195, 107, 38);
		frame.getContentPane().add(btnModificar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(frmProductos.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
		btnCancelar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnCancelar.setBounds(275, 195, 114, 38);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(frmProductos.class.getResource("/recursos/frmprincipal/Aceptar (2).png")));
		btnGuardar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnGuardar.setBounds(28, 195, 116, 38);
		frame.getContentPane().add(btnGuardar);
	}
}
