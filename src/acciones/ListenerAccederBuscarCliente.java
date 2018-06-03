package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Puente;
import utiles.Utiles;

public class ListenerAccederBuscarCliente implements ActionListener{

	private Puente puente;

	public ListenerAccederBuscarCliente(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		puente.getContentPane().removeAll();
		puente.getContentPane().add(puente.getVistaAccederBuscarCliente().getVistaEjecutarBuscarCliente());
		Utiles.actualizar(puente);
	}

}
