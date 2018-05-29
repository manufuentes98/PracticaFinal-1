package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JMenuItem;

public class VistaPrincipal extends JFrame {

	protected JPanel contentPane;
	protected PanelArticulo panelArticulo = new PanelArticulo();
	protected PanelCliente panelCliente = new PanelCliente();
	protected PanelPedido panelPedido = new PanelPedido();
	protected JMenuItem mntmDarDeAlta;
	public JButton getBotonPedido() {
		return panelPedido.getBotonPedido();
	}

	

	protected JMenuItem mntmBuscarArticulo;

	public VistaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArticulos = new JMenu("Articulos");
		menuBar.add(mnArticulos);

		mntmDarDeAlta = new JMenuItem("Nuevo Articulo");
		mnArticulos.add(mntmDarDeAlta);

		mntmBuscarArticulo = new JMenuItem("Buscar Articulo");
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

	public JButton getBotonArticulo() {
		return panelArticulo.getBotonArticulo();
	}

	public JTextField getTextNombreAltaArticulo() {
		return panelArticulo.getTextNombreAltaArticulo();
	}

	public JTextField getTextDescripcionAltaArticulo() {
		return panelArticulo.getTextDescripcionAltaArticulo();
	}

	public VistaAccederAltaArticulo getVistaAccederAltaArticulo() {
		return panelArticulo.getVistaAccederAltaArticulo();
	}

	public VistaAccederBuscarArticulo getVistaAccederBuscarArticulo() {
		return panelArticulo.getVistaAccederBuscarArticulo();
	}


	public PanelCliente getPanelCliente() {
		return panelCliente;
	}
	public VistaAccederAltaCliente getVistaAccederAltaCliente() {
		return panelCliente.getVistaAccederAltaCliente();
	}

	public VistaAccederBuscarCliente getVistaAccederBuscarCliente() {
		return panelCliente.getVistaAccederBuscarCliente();
	}
	public VistaAccederBorrarCliente getVistaAccederBorrarCliente() {
		return panelCliente.getVistaAccederBorrarCliente();
	}

	public JTextField getTextBuscarBuscarArticulo() {
		return panelArticulo.getTextBuscarBuscarArticulo();
	}

	public JTextField getTextDescripcionBuscarArticulo() {
		return panelArticulo.getTextDescripcionBuscarArticulo();
	}

	public JTextField getTextPrecioBuscarArticulo() {
		return panelArticulo.getTextPrecioBuscarArticulo();
	}

	public VistaEjecutarAltaArticulo getVistaEjecutarAltaArticulo() {
		return panelArticulo.getVistaEjecutarAltaArticulo();
	}

	public VistaEjecutarBuscarArticulo getVistaEjecutarBuscarArticulo() {
		return panelArticulo.getVistaEjecutarBuscarArticulo();
	}

	public PanelArticulo getPanelArticulo() {
		return panelArticulo;
	}

	public void setBotonPedido(JButton botonPedido) {
		panelPedido.setBotonPedido(botonPedido);
	}

	public VistaAccederAltaPedido getVistaAccederAltaPedido() {
		return panelPedido.getVistaAccederAltaPedido();
	}

	public void setVistaAccederAltaPedido(VistaAccederAltaPedido vistaAccederAltaPedido) {
		panelPedido.setVistaAccederAltaPedido(vistaAccederAltaPedido);
	}

	public VistaAccederPedido getVistaAccederPedido() {
		return panelPedido.getVistaAccederPedido();
	}

	public void setVistaAccederPedido(VistaAccederPedido vistaAccederPedido) {
		panelPedido.setVistaAccederPedido(vistaAccederPedido);
	}

	public PanelPedido getPanelPedido() {
		return panelPedido;
	}

	public void setPanelPedido(PanelPedido panelPedido) {
		this.panelPedido = panelPedido;
	}
}