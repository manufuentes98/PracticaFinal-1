package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCliente extends JPanel {

	protected JButton botonCliente;

	public PanelCliente() {
		setLayout(new GridLayout(0, 1, 0, 0));
		botonCliente = new JButton("Clientes");
		add(botonCliente);
	}

}