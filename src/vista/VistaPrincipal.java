package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JMenuItem;

public class VistaPrincipal extends JFrame {

	private JPanel contentPane;
	private PanelArticulo panelArticulo = new PanelArticulo();
	private PanelCliente panelCliente = new PanelCliente();
	private PanelPedido panelPedido = new PanelPedido();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
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
	public VistaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
				JMenu mnArticulos = new JMenu("Articulos");
				menuBar.add(mnArticulos);
				
				JMenuItem mntmDarDeAlta = new JMenuItem("Nuevo Articulo");
				mnArticulos.add(mntmDarDeAlta);
				
				JMenuItem mntmBuscarArticulo = new JMenuItem("Buscar Articulo");
				mnArticulos.add(mntmBuscarArticulo);

		JMenu mnClientes = new JMenu("Clientes");
		menuBar.add(mnClientes);
		
		JMenuItem mntmDarAltaCliente = new JMenuItem("Nuevo Cliente");
		mnClientes.add(mntmDarAltaCliente);
		
		JMenuItem mntmBuscarCliente = new JMenuItem("Buscar Cliente");
		mnClientes.add(mntmBuscarCliente);

		JMenu mnPedidos = new JMenu("Pedidos");
		menuBar.add(mnPedidos);
		
		JMenuItem mntmNuevoPedido = new JMenuItem("Nuevo Pedido");
		mnPedidos.add(mntmNuevoPedido);
		
		JMenuItem mntmBuscarPedido = new JMenuItem("Buscar Pedido");
		mnPedidos.add(mntmBuscarPedido);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		contentPane.add(panelArticulo);
		contentPane.add(panelCliente);
		contentPane.add(panelPedido);

	}

}