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

	public VistaAccederAltaArticulo() {
		setLayout(new BorderLayout(0, 0));
		JLabel lblAltaCliente = new JLabel("Alta Articulo");
		lblAltaCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblAltaCliente.setFont(new Font("David", Font.BOLD, 22));
		lblAltaCliente.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblAltaCliente, BorderLayout.SOUTH);

		botonAltaArticulo = new JButton("");
		add(botonAltaArticulo, BorderLayout.CENTER);
	}

}