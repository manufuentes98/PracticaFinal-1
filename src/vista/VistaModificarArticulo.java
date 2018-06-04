package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class VistaModificarArticulo extends JPanel {
	private JLabel lblMensaje;
	private JTextField textMPrecio;
	private JPanel panel;
	private JLabel lblMDarDeAlta;
	private JButton btnMGuardar;

	/**
	 * Create the panel.
	 */
	public VistaModificarArticulo() {
		setBackground(SystemColor.activeCaption);
		setLayout(new BorderLayout(0, 0));

		lblMDarDeAlta = new JLabel("Modificar Art\u00EDculo");
		lblMDarDeAlta.setFont(new Font("Gentium Book Basic", Font.BOLD | Font.ITALIC, 36));
		lblMDarDeAlta.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblMDarDeAlta, BorderLayout.NORTH);

		lblMensaje = new JLabel(" ");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblMensaje, BorderLayout.SOUTH);

		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30 };
		gbl_panel.rowHeights = new int[] { 30, 30, 10, 30, 30, 30, 10, 30, 30, 30, 30 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		panel.setLayout(gbl_panel);

		JLabel lblMPrecio = new JLabel("Precio:");
		GridBagConstraints gbc_lblMPrecio = new GridBagConstraints();
		gbc_lblMPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblMPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblMPrecio.gridx = 2;
		gbc_lblMPrecio.gridy = 5;
		panel.add(lblMPrecio, gbc_lblMPrecio);

		textMPrecio = new JTextField();
		textMPrecio.setBorder(UIManager.getBorder("DesktopIcon.border"));
		GridBagConstraints gbc_textMPrecio = new GridBagConstraints();
		gbc_textMPrecio.gridwidth = 7;
		gbc_textMPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_textMPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_textMPrecio.gridx = 3;
		gbc_textMPrecio.gridy = 5;
		panel.add(textMPrecio, gbc_textMPrecio);
		textMPrecio.setColumns(10);

		btnMGuardar = new JButton("Guardar");
		btnMGuardar.setIconTextGap(5);
		btnMGuardar.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		GridBagConstraints gbc_btnMGuardar = new GridBagConstraints();
		gbc_btnMGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnMGuardar.fill = GridBagConstraints.BOTH;
		gbc_btnMGuardar.gridx = 10;
		gbc_btnMGuardar.gridy = 8;
		panel.add(btnMGuardar, gbc_btnMGuardar);
	}

	public JButton getBtnGuardar() {
		return btnMGuardar;
	}

	public JLabel getLblDarDeAlta() {
		return lblMDarDeAlta;
	}

	public JTextField getTextPrecio() {
		return textMPrecio;
	}

	public JPanel getPanel() {
		return panel;
	}

	public JLabel getLblMensaje() {
		return lblMensaje;
	}
}
