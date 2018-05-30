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
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;

public class VistaEjecutarAltaArticulo extends JPanel {
	private JTextField textNombreAltaArticulo;
	private JTextField textDescripcionAltaArticulo;
	private JLabel lblMensaje;
	private JTextField textPrecio;
	private JPanel panel;
	private JLabel lblDarDeAlta;

	public VistaEjecutarAltaArticulo() {
		setBackground(SystemColor.activeCaption);
		setLayout(new BorderLayout(0, 0));

		lblDarDeAlta = new JLabel("Dar Alta Articulo");
		lblDarDeAlta.setFont(new Font("Gentium Book Basic", Font.BOLD | Font.ITALIC, 36));
		lblDarDeAlta.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblDarDeAlta, BorderLayout.NORTH);

		lblMensaje = new JLabel(" ");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblMensaje, BorderLayout.SOUTH);

		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_panel.rowHeights = new int[] { 30, 30, 10, 30, 30, 30, 10, 30, 30, 30, 30 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		textNombreAltaArticulo = new JTextField();
		textNombreAltaArticulo.setBorder(UIManager.getBorder("DesktopIcon.border"));
		GridBagConstraints gbc_textNombreArticulo = new GridBagConstraints();
		gbc_textNombreArticulo.gridwidth = 7;
		gbc_textNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreArticulo.gridx = 3;
		gbc_textNombreArticulo.gridy = 1;
		panel.add(textNombreAltaArticulo, gbc_textNombreArticulo);
		textNombreAltaArticulo.setColumns(10);

		textDescripcionAltaArticulo = new JTextField();
		textDescripcionAltaArticulo.setBorder(UIManager.getBorder("DesktopIcon.border"));
		textDescripcionAltaArticulo.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textDescripcionArticulo = new GridBagConstraints();
		gbc_textDescripcionArticulo.gridheight = 3;
		gbc_textDescripcionArticulo.gridwidth = 7;
		gbc_textDescripcionArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_textDescripcionArticulo.fill = GridBagConstraints.BOTH;
		gbc_textDescripcionArticulo.gridx = 3;
		gbc_textDescripcionArticulo.gridy = 3;
		panel.add(textDescripcionAltaArticulo, gbc_textDescripcionArticulo);
		textDescripcionAltaArticulo.setColumns(10);

		JLabel lblDescripcion = new JLabel("Descripcion:");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 2;
		gbc_lblDescripcion.gridy = 4;
		panel.add(lblDescripcion, gbc_lblDescripcion);

		JLabel lblPrecio = new JLabel("Precio:");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 2;
		gbc_lblPrecio.gridy = 7;
		panel.add(lblPrecio, gbc_lblPrecio);

		textPrecio = new JTextField();
		textPrecio.setBorder(UIManager.getBorder("DesktopIcon.border"));
		GridBagConstraints gbc_textPrecio = new GridBagConstraints();
		gbc_textPrecio.gridwidth = 7;
		gbc_textPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_textPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrecio.gridx = 3;
		gbc_textPrecio.gridy = 7;
		panel.add(textPrecio, gbc_textPrecio);
		textPrecio.setColumns(10);
										
												JButton btnGuardar = new JButton("Guardar");
												btnGuardar.setIconTextGap(5);
												btnGuardar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
												
														GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
														gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
														gbc_btnGuardar.fill = GridBagConstraints.BOTH;
														gbc_btnGuardar.gridheight = 2;
														gbc_btnGuardar.gridx = 10;
														gbc_btnGuardar.gridy = 8;
														panel.add(btnGuardar, gbc_btnGuardar);
	}

	public JLabel getLblDarDeAlta() {
		return lblDarDeAlta;
	}

	public JTextField getTextPrecio() {
		return textPrecio;
	}

	public JPanel getPanel() {
		return panel;
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