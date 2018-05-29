package vista;

import java.awt.GridLayout;

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
  
	public JButton getBotonPedido() {
		return botonPedido;
	}

	public void setBotonPedido(JButton botonPedido) {
		this.botonPedido = botonPedido;
	}

	public VistaAccederAltaPedido getVistaAccederAltaPedido() {
		return vistaAccederAltaPedido;
	}

	public void setVistaAccederAltaPedido(VistaAccederAltaPedido vistaAccederAltaPedido) {
		this.vistaAccederAltaPedido = vistaAccederAltaPedido;
	}

	public VistaAccederPedido getVistaAccederPedido() {
		return vistaAccederPedido;
	}

	public void setVistaAccederPedido(VistaAccederPedido vistaAccederPedido) {
		this.vistaAccederPedido = vistaAccederPedido;
	}

	public PanelPedido() {
		setLayout(new BorderLayout(0, 0));
		botonPedido = new JButton("");
		add(botonPedido);
		
		JLabel lblPedidos = new JLabel("PEDIDOS");
		lblPedidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPedidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblPedidos, BorderLayout.SOUTH);
	}
}