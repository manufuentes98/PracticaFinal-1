package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCliente extends JPanel {

	protected JButton BotonCliente;
	private VistaAccederAltaCliente vistaAccederAltaCliente = new VistaAccederAltaCliente();
	private VistaAccederBuscarCliente vistaAccederBuscarCliente = new VistaAccederBuscarCliente();
	private VistaAccederBorrarCliente vistaAccederBorrarCliente = new VistaAccederBorrarCliente();

	public PanelCliente() {
		setLayout(new GridLayout(0, 1, 0, 0));
		BotonCliente = new JButton("Clientes");
		add(BotonCliente);
	}

	public VistaAccederAltaCliente getVistaAccederAltaCliente() {
		return vistaAccederAltaCliente;
	}

	public VistaAccederBuscarCliente getVistaAccederBuscarCliente() {
		return vistaAccederBuscarCliente;
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

}