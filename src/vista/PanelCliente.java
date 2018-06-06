package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import utiles.Utiles;

public class PanelCliente extends JPanel {

	private JButton BotonCliente;
	private VistaAccederAltaCliente vistaAccederAltaCliente = new VistaAccederAltaCliente();
	private VistaAccederBuscarCliente vistaAccederBuscarCliente = new VistaAccederBuscarCliente();
	private JPanel panel;
	private JLabel lblClientes;

	public PanelCliente() {
		setLayout(new BorderLayout(0, 0));
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		BotonCliente = new JButton("");
		panel.add(BotonCliente);
		lblClientes = new JLabel("CLIENTES");
		lblClientes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblClientes.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon imageIcon= new ImageIcon("img/clientes.png");	
		BotonCliente.setIcon(Utiles.createScaledIcon(imageIcon, BotonCliente.getHeight()));

		add(lblClientes, BorderLayout.SOUTH);
	}

	public VistaAccederAltaCliente getVistaAccederAltaCliente() {
		return vistaAccederAltaCliente;
	}

	public VistaAccederBuscarCliente getVistaAccederBuscarCliente() {
		return vistaAccederBuscarCliente;
	}

	public JPanel getPanel() {
		return panel;
	}

	public JLabel getLblClientes() {
		return lblClientes;
	}

	public JButton getBotonCliente() {
		return BotonCliente;
	}

	public JButton getBtnAltaCliente() {
		return vistaAccederAltaCliente.getBtnAltaCliente();
	}

	public JButton getBtnBuscarCliente() {
		return vistaAccederBuscarCliente.getBtnBuscarCliente();
	}

	public DefaultTableModel getModeloTabla() {
		return vistaAccederBuscarCliente.getModeloTabla();
	}

	public VistaEjecutarAltaCliente getVistaEjecutarAltaCliente() {
		return vistaAccederAltaCliente.getVistaEjecutarAltaCliente();
	}

	public VistaEjecutarBuscarCliente getVistaEjecutarBuscarCliente() {
		return vistaAccederBuscarCliente.getVistaEjecutarBuscarCliente();
	}

}