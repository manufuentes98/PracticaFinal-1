package acciones;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import control.Logica;
import control.Puente;
import utiles.Utiles;

public class ListenerCliente implements ActionListener{
	private Puente puente;
	
	public ListenerCliente(Puente puente) {
		super();
		this.puente = puente;
	}

	public void actionPerformed(ActionEvent e) {
		puente.getPanelCliente().removeAll();
		puente.getPanelCliente().setLayout(new GridLayout(2, 0, 0, 0));
		puente.getPanelCliente().add(puente.getVistaAccederAltaCliente());
		puente.getPanelCliente().add(puente.getVistaAccederBuscarCliente());
		Utiles.actualizar(puente);
	}
}