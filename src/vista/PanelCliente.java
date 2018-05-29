package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCliente extends JPanel {

	protected JButton BotonCliente;
	private VistaAccederAltaCliente VistaAccederAltaCliente;
	private VistaAccederBuscarCliente VistaAccederBuscarCliente;
	private VistaAccederBorrarCliente VistaAccederBorrarCliente;


	public PanelCliente() {
		setLayout(new GridLayout(0, 1, 0, 0));
		BotonCliente = new JButton("Clientes");
		add(BotonCliente);
	}
	public VistaAccederAltaCliente getVistaAccederAltaCliente() {
		return VistaAccederAltaCliente;
	}

	public VistaAccederBuscarCliente getVistaAccederBuscarCliente() {
		return VistaAccederBuscarCliente;
	}

	public JButton getBotonCliente() {
		return BotonCliente;
	}
	public VistaAccederBorrarCliente getVistaAccederBorrarCliente() {
		return VistaAccederBorrarCliente;
	}

}