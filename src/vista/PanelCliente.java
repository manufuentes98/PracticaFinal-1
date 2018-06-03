package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelCliente extends JPanel {

	private JButton BotonCliente;
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

	public JTextField getTxtId() {
		return vistaAccederBorrarCliente.getTxtId();
	}

	public JTextField getTxtNombre() {
		return vistaAccederBorrarCliente.getTxtNombre();
	}

	public JButton getBtnValidar() {
		return vistaAccederBorrarCliente.getBtnValidar();
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

	public VistaAccederBorrarCliente getVistaAccederBorrarCliente() {
		return vistaAccederBorrarCliente;
	}

	public JButton getBtnBorrarCliente() {
		return vistaAccederBorrarCliente.getBtnBorrarCliente();
	}

	public VistaEjecutarBorrarCliente getVistaEjecutarBorrarCliente() {
		return vistaAccederBorrarCliente.getVistaEjecutarBorrarCliente();
	}

}