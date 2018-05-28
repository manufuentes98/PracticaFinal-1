package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class VistaEjecutarAltaArticulo extends JPanel {
	private JTextField textNombreAltaArticulo;
	private JTextField textDescripcionAltaArticulo;
	private JLabel lblMensaje;

	public VistaEjecutarAltaArticulo() {
		setLayout(new BorderLayout(0, 0));

		JLabel lblDarDeAlta = new JLabel("Dar Alta Articulo");
		lblDarDeAlta.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblDarDeAlta.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblDarDeAlta, BorderLayout.NORTH);

		lblMensaje = new JLabel(" ");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblMensaje, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 4;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		textNombreAltaArticulo = new JTextField();
		GridBagConstraints gbc_textNombreArticulo = new GridBagConstraints();
		gbc_textNombreArticulo.gridwidth = 7;
		gbc_textNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreArticulo.gridx = 4;
		gbc_textNombreArticulo.gridy = 4;
		panel.add(textNombreAltaArticulo, gbc_textNombreArticulo);
		textNombreAltaArticulo.setColumns(10);

		textDescripcionAltaArticulo = new JTextField();
		textDescripcionAltaArticulo.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textDescripcionArticulo = new GridBagConstraints();
		gbc_textDescripcionArticulo.gridheight = 3;
		gbc_textDescripcionArticulo.gridwidth = 7;
		gbc_textDescripcionArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_textDescripcionArticulo.fill = GridBagConstraints.BOTH;
		gbc_textDescripcionArticulo.gridx = 4;
		gbc_textDescripcionArticulo.gridy = 7;
		panel.add(textDescripcionAltaArticulo, gbc_textDescripcionArticulo);
		textDescripcionAltaArticulo.setColumns(10);

		JLabel lblDescripcion = new JLabel("Descripcion:");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 3;
		gbc_lblDescripcion.gridy = 8;
		panel.add(lblDescripcion, gbc_lblDescripcion);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIconTextGap(5);
		btnGuardar.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.fill = GridBagConstraints.BOTH;
		gbc_btnGuardar.gridheight = 3;
		gbc_btnGuardar.gridwidth = 4;
		gbc_btnGuardar.gridx = 13;
		gbc_btnGuardar.gridy = 10;
		panel.add(btnGuardar, gbc_btnGuardar);
	}

	public JTextField getTextNombreAltaArticulo() {
		return textNombreAltaArticulo;
	}

	public JTextField getTextDescripcionAltaArticulo() {
		return textDescripcionAltaArticulo;
	}

	public JLabel getLblMensaje() {
		return lblMensaje;
	}

}