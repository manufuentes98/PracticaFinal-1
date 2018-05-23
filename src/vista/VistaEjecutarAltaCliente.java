package vista;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.border.MatteBorder;

public class VistaEjecutarAltaCliente extends JPanel{

	public VistaEjecutarAltaCliente() {
	
		JLabel lblComprobacion = new JLabel("Usted se ha dado de alta correctamente");
		lblComprobacion.setHorizontalAlignment(SwingConstants.LEFT);
		lblComprobacion.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		lblComprobacion.setVisible(false);
		
		JLabel lblDarAltaCliente = new JLabel("Dar Alta Cliente");
		lblDarAltaCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblDarAltaCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblDarAltaCliente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		setLayout(new BorderLayout(0, 0));
		add(lblComprobacion, BorderLayout.SOUTH);
		add(lblDarAltaCliente, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 2;
		panel.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 4;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 2;
		panel.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.anchor = GridBagConstraints.EAST;
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 1;
		gbc_lblTelfono.gridy = 5;
		panel.add(lblTelfono, gbc_lblTelfono);
		
		txtTelefono = new JTextField();
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 2;
		gbc_txtTelefono.gridy = 5;
		panel.add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n");
		lblDireccion.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 1;
		gbc_lblDireccion.gridy = 8;
		panel.add(lblDireccion, gbc_lblDireccion);
		
		txtDireccion = new JTextField();
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.gridwidth = 4;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion.gridx = 2;
		gbc_txtDireccion.gridy = 8;
		panel.add(txtDireccion, gbc_txtDireccion);
		txtDireccion.setColumns(10);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.setIconTextGap(5);
		btnValidar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		btnValidar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		GridBagConstraints gbc_btnValidar = new GridBagConstraints();
		gbc_btnValidar.gridwidth = 4;
		gbc_btnValidar.insets = new Insets(0, 0, 0, 5);
		gbc_btnValidar.gridx = 6;
		gbc_btnValidar.gridy = 11;
		panel.add(btnValidar, gbc_btnValidar);
	}

  public JPanel VistaEjecutarAltaCliente;
  private JTextField txtNombre;
  private JTextField txtDireccion;
  private JTextField txtTelefono;
}