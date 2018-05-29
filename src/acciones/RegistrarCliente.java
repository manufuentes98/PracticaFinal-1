package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import control.Logica;
import control.Puente;

public class RegistrarCliente implements ActionListener{
	private Puente puente;
	
	public RegistrarCliente(Puente puente) {
		super();
		this.puente = puente;
	}

	public void actionPerformed(ActionEvent e) {
		puente.remove(puente.getPanelCliente());
		puente.getPanelCliente().remove(puente.getPanelCliente());
		puente.add(puente.getVistaAccederAltaCliente());
		puente.add(puente.getVistaAccederBuscarCliente());
		puente.repaint();
		puente.revalidate();
	}
}