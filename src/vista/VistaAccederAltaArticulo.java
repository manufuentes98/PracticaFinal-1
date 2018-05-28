package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class VistaAccederAltaArticulo extends JPanel {

	protected JButton botonAltaArticulo;
	protected VistaEjecutarAltaArticulo vistaEjecutarAltaArticulo=new VistaEjecutarAltaArticulo();

	public VistaAccederAltaArticulo() {
		vistaEjecutarAltaArticulo.getTextField_1().setHorizontalAlignment(SwingConstants.LEADING);
		setLayout(new BorderLayout(0, 0));
		JLabel lblAltaArticulo = new JLabel("Alta Articulo");
		lblAltaArticulo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblAltaArticulo.setFont(new Font("David", Font.BOLD, 22));
		lblAltaArticulo.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblAltaArticulo, BorderLayout.SOUTH);
		botonAltaArticulo = new JButton("");
		add(botonAltaArticulo, BorderLayout.CENTER);
	}

	public VistaEjecutarAltaArticulo getVistaEjecutarAltaArticulo() {
		return vistaEjecutarAltaArticulo;
	}

	public JButton getBotonAltaArticulo() {
		return botonAltaArticulo;
	}

}