package Formularios;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.BoxLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.BorderLayout;

import javax.swing.JProgressBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class frmPrincipal extends JFrame{

	private JFrame frame;
	String tipoUsuario;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal window = new frmPrincipal();
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

	

	public frmPrincipal() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent arg0) {
			}
		});
		frame.setBounds(100, 100, 1034, 621);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnSistema = new JMenu("Sistema");
		menuBar.add(mnSistema);
		
		JMenuItem mntmCambiar = new JMenuItem("Cambiar de Usuario");
		mntmCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "otro formulario");
				
			}
		});
		mnSistema.add(mntmCambiar);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnSistema.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmAgregarTipoDe = new JMenuItem("Agregar Tipo de Producto");
		mntmAgregarTipoDe.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		JMenuItem mntmAgregarUnProducto = new JMenuItem("Agregar un Producto");
		mntmAgregarUnProducto.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		mnMantenimiento.add(mntmAgregarUnProducto);
		mnMantenimiento.add(mntmAgregarTipoDe);
		
		JMenu mnConsultas = new JMenu("Consultas");
		menuBar.add(mnConsultas);
		
		JMenuItem mntmE = new JMenuItem("Producto");
	
		mnConsultas.add(mntmE);
		
		JMenu menu = new JMenu("");
		menuBar.add(menu);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(desktopPane);
		desktopPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(7, 0, 1004, 62);
		desktopPane.add(toolBar);
		
		JButton btnFacturar = new JButton("Facturar");
		btnFacturar.setToolTipText("Facturar");
		btnFacturar.setVerticalAlignment(SwingConstants.TOP);
		btnFacturar.setHorizontalAlignment(SwingConstants.LEFT);
		btnFacturar.setFont(new Font("Arial", Font.BOLD, 16));
		btnFacturar.setIcon(new ImageIcon(frmPrincipal.class.getResource("/recursos/frmprincipal/1415496836_698568-icon-56-document-text-48.png")));
		toolBar.add(btnFacturar);
		
		JButton btnInventario = new JButton("Inventario");
		btnInventario.setIcon(new ImageIcon(frmPrincipal.class.getResource("/recursos/frmprincipal/inventario.png")));
		btnInventario.setFont(new Font("Arial", Font.BOLD, 16));
		toolBar.add(btnInventario);
		
		JButton btnDevolucion = new JButton("Devolucion");
		btnDevolucion.setIcon(new ImageIcon(frmPrincipal.class.getResource("/recursos/frmprincipal/1415499004_Rotation.png")));
		btnDevolucion.setFont(new Font("Arial", Font.BOLD, 16));
		toolBar.add(btnDevolucion);
		
		JButton btnNewButton = new JButton("Reportes");
		btnNewButton.setIcon(new ImageIcon(frmPrincipal.class.getResource("/recursos/frmprincipal/1415499313_Computer_Analysis-48.png")));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		toolBar.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setBounds(7, 68, 1004, 437);
		desktopPane.add(label);
	
		
	}
}
