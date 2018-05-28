package vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;

public class PanelArticulo extends JPanel {

	private JButton botonArticulo;
	private VistaAccederAltaArticulo vistaAccederAltaArticulo = new VistaAccederAltaArticulo();
	private VistaAccederBuscarArticulo vistaAccederBuscarArticulo = new VistaAccederBuscarArticulo();

	public PanelArticulo() {
		setLayout(new GridLayout(0, 1, 0, 0));
		botonArticulo = new JButton("Articulos");
		add(botonArticulo);
	}

	public JButton getBotonArticulo() {
		return botonArticulo;
	}

	public JTextField getTextNombreAltaArticulo() {
		return vistaAccederAltaArticulo.getTextNombreAltaArticulo();
	}

	public JTextField getTextDescripcionAltaArticulo() {
		return vistaAccederAltaArticulo.getTextDescripcionAltaArticulo();
	}

	public JTextField getTextBuscarBuscarArticulo() {
		return vistaAccederBuscarArticulo.getTextBuscarBuscarArticulo();
	}

	public JTextField getTextDescripcionBuscarArticulo() {
		return vistaAccederBuscarArticulo.getTextDescripcionBuscarArticulo();
	}

	public JTextField getTextPrecioBuscarArticulo() {
		return vistaAccederBuscarArticulo.getTextPrecioBuscarArticulo();
	}

	public VistaAccederAltaArticulo getVistaAccederAltaArticulo() {
		return vistaAccederAltaArticulo;
	}

	public VistaEjecutarAltaArticulo getVistaEjecutarAltaArticulo() {
		return vistaAccederAltaArticulo.getVistaEjecutarAltaArticulo();
	}

	public VistaAccederBuscarArticulo getVistaAccederBuscarArticulo() {
		return vistaAccederBuscarArticulo;
	}

	public VistaEjecutarBuscarArticulo getVistaEjecutarBuscarArticulo() {
		return vistaAccederBuscarArticulo.getVistaEjecutarBuscarArticulo();
	}
}