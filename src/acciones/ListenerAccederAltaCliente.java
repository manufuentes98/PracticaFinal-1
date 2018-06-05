package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Puente;
import utiles.Utiles;

public class ListenerAccederAltaCliente implements ActionListener{
	private Puente puente;

	public ListenerAccederAltaCliente(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		puente.getContentPane().removeAll();
		puente.getContentPane().add(puente.getVistaEjecutarAltaCliente());
		Utiles.actualizar(puente);

}
}