package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Window.Type;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import Clases.BaseDatos;
import Clases.DBLoguin;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.awt.Color;

public class frmAutenticacion {

	private JFrame frame;
	private JTextField txtUsuario;
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAutenticacion window = new frmAutenticacion();
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
	public frmAutenticacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(frmAutenticacion.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frame.setResizable(false);
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 378, 233);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//// etiquetas del loguin
		JLabel lblControlDeUsuario = new JLabel("Loguin");
		lblControlDeUsuario.setForeground(new Color(25, 25, 112));
		lblControlDeUsuario.setFont(new Font("Arial", Font.BOLD, 18));
		lblControlDeUsuario.setBounds(145, 6, 89, 33);
		frame.getContentPane().add(lblControlDeUsuario);
		
		//////// codigo del frame para la imagen del logo
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		panel.setBounds(6, 51, 103, 113);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		panel.add(label);
		
		//// etiquetas par el letrero del nombre de usuario y conntrasena
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblUsuario.setBounds(121, 51, 55, 16);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblContrasena = new JLabel("Contrasena");
		lblContrasena.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblContrasena.setBounds(121, 90, 79, 16);
		frame.getContentPane().add(lblContrasena);
		
		///////// codigo campo de texto para el nombre de usuario
		txtUsuario = new JTextField();
		txtUsuario.setToolTipText("Ingrese su Nombre de Usuario");
		txtUsuario.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtUsuario.setBounds(208, 45, 158, 28);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		/////campo de texto para la contrasena
		txtPass = new JPasswordField();
		txtPass.setToolTipText("Ingrese su Contrasena");
		txtPass.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtPass.setBounds(208, 84, 158, 28);
		frame.getContentPane().add(txtPass);
		
		////cracion del boton aceptar
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DBLoguin loguin = new DBLoguin();
				loguin.Acceder(txtUsuario.getText(), txtPass.getText());
			}
		});
		btnAceptar.setToolTipText("Hacer clic para entrar");
		btnAceptar.setIcon(new ImageIcon(frmAutenticacion.class.getResource("/recursos/frmprincipal/Aceptar (2).png")));
		
	
		btnAceptar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnAceptar.setBounds(120, 139, 114, 52);
		frame.getContentPane().add(btnAceptar);
		
		//// codigo para crear el boton cancelar
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DBLoguin logu = new DBLoguin();
				logu.Acceder(txtUsuario.getText(), txtPass.getText());
				
			}
		});
		btnCancelar.setToolTipText("Hacer clic para cancelar");
		btnCancelar.setIcon(new ImageIcon(frmAutenticacion.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
		btnCancelar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnCancelar.setBounds(252, 139, 114, 52);
		frame.getContentPane().add(btnCancelar);
	}

	
}
