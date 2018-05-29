package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelCliente extends JPanel {

	protected JButton BotonCliente;
	private VistaAccederAltaCliente vistaAccederAltaCliente = new VistaAccederAltaCliente();
	private VistaAccederBuscarCliente vistaAccederBuscarCliente = new VistaAccederBuscarCliente();
	private VistaAccederBorrarCliente vistaAccederBorrarCliente = new VistaAccederBorrarCliente();
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

	public VistaAccederBorrarCliente getVistaAccederBorrarCliente() {
		return vistaAccederBorrarCliente;
	}

	public JButton getBtnBorrarCliente() {
		return vistaAccederBorrarCliente.getBtnBorrarCliente();
	}

	public JButton getBtnAltaCliente() {
		return vistaAccederAltaCliente.getBtnAltaCliente();
	}

	public JButton getBtnBuscarCliente() {
		return vistaAccederBuscarCliente.getBtnBuscarCliente();
	}

}