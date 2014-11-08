package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
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

public class frmPrincipal {

	private JFrame frame;

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
		frame.setBounds(100, 100, 612, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnSistema = new JMenu("Sistema");
		menuBar.add(mnSistema);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenu mnConsultas = new JMenu("Consultas");
		menuBar.add(mnConsultas);
		
		JMenuItem mntmE = new JMenuItem("Producto");
		mntmE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmProducto Producto = new frmProducto();
				Producto.setVisible(true);
				
			}
		});
		mnConsultas.add(mntmE);
		
		JMenu menu = new JMenu("");
		menuBar.add(menu);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		frame.getContentPane().setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 596, 63);
		frame.getContentPane().add(toolBar);
		
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
		
		JSeparator separator_1 = new JSeparator();
		toolBar.add(separator_1);
		
		JSeparator separator = new JSeparator();
		toolBar.add(separator);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(73, 184, 301, -68);
		frame.getContentPane().add(desktopPane);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.GRAY);
		desktopPane_1.setBounds(0, 74, 0, 0);
		frame.getContentPane().add(desktopPane_1);
		desktopPane_1.setLayout(new BoxLayout(desktopPane_1, BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.GRAY);
		desktopPane_2.setBounds(0, 62, 1, 1);
		frame.getContentPane().add(desktopPane_2);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.LIGHT_GRAY);
		desktopPane_3.setBounds(0, 74, 1, 1);
		frame.getContentPane().add(desktopPane_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 340, 606, -14);
		frame.getContentPane().add(panel);
		
		JToolBar toolBar_1 = new JToolBar();
		toolBar_1.setForeground(Color.GRAY);
		toolBar_1.setBounds(0, 333, 87, 16);
		frame.getContentPane().add(toolBar_1);
	}
}
