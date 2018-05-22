package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPedido extends JPanel {

	protected JButton botonPedido;
  
	public PanelPedido() {
		setLayout(new GridLayout(0, 1, 0, 0));
		botonPedido = new JButton("Pedidos");
		add(botonPedido);
	}

}