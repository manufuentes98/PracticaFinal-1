package vista;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaEjecutarBorrarCliente extends JPanel{
	public VistaEjecutarBorrarCliente() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblBorrarCliente = new JLabel("Borrar Cliente");
		lblBorrarCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblBorrarCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrarCliente.setFont(new Font("Tahoma", Font.BOLD, 35));
		add(lblBorrarCliente, BorderLayout.NORTH);
		
		JLabel lblMensaje = new JLabel("Mensaje:");
		lblMensaje.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		add(lblMensaje, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblid = new JLabel("DNI/CIF");
		lblid.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblid = new GridBagConstraints();
		gbc_lblid.insets = new Insets(0, 0, 5, 5);
		gbc_lblid.gridx = 2;
		gbc_lblid.gridy = 3;
		panel.add(lblid, gbc_lblid);
		
		txtId = new JTextField();
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.insets = new Insets(0, 0, 5, 5);
		gbc_txtId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtId.gridx = 4;
		gbc_txtId.gridy = 3;
		panel.add(txtId, gbc_txtId);
		txtId.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 6;
		panel.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridwidth = 10;
		gbc_txtNombre.gridx = 4;
		gbc_txtNombre.gridy = 6;
		panel.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		GridBagConstraints gbc_btnValidar = new GridBagConstraints();
		gbc_btnValidar.insets = new Insets(0, 0, 0, 5);
		gbc_btnValidar.gridx = 14;
		gbc_btnValidar.gridy = 10;
		panel.add(btnValidar, gbc_btnValidar);
	}

  public JPanel VistaEjecutarBorrarCliente;
  private JTextField txtId;
  private JTextField txtNombre;

}