package vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelPedido extends JPanel {

	private JButton botonPedido;
	private VistaAccederAltaPedido vistaAccederAltaPedido = new VistaAccederAltaPedido();
	private VistaAccederPedido vistaAccederPedido = new VistaAccederPedido();
	private JLabel lblPedidos;
	private JPanel panelPedido;

	public PanelPedido() {
		setLayout(new BorderLayout(0, 0));
		botonPedido = new JButton("");
		add(botonPedido);

		lblPedidos = new JLabel("PEDIDOS");
		lblPedidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPedidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblPedidos, BorderLayout.SOUTH);
	}

	public JLabel getLblPedidos() {
		return lblPedidos;
	}

	public VistaEjecutarAltaPedido getVistaEjecutarAltaPedido() {
		return vistaAccederAltaPedido.getVistaEjecutarAltaPedido();
	}

	public JPanel getPanelPedido() {
		return panelPedido;
	}

	public JButton getBtnConsultarPedidos() {
		return vistaAccederPedido.getBtnConsultarPedidos();
	}

	public JButton getBtnAccederAltaPedido() {
		return vistaAccederAltaPedido.getBtnAccederAltaPedido();
	}

	public JButton getBotonPedido() {
		return botonPedido;
	}

	public VistaAccederAltaPedido getVistaAccederAltaPedido() {
		return vistaAccederAltaPedido;
	}

	public VistaAccederPedido getVistaAccederPedido() {
		return vistaAccederPedido;
	}
}