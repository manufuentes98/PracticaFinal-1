package vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class PanelArticulo extends JPanel {

	protected JButton botonArticulo;

	public PanelArticulo() {
		setLayout(new GridLayout(0, 1, 0, 0));
		botonArticulo = new JButton("Articulos");
		add(botonArticulo);
	}

}