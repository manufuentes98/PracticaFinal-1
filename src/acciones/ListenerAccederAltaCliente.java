package acciones;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Puente;

public class ListenerAccederAltaCliente implements ActionListener{
	private Puente puente;

	public ListenerAccederAltaCliente(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		puente.getContentPane().removeAll();
		puente.getContentPane().setLayout(new BorderLayout(0, 0));
		puente.getContentPane().add(puente.getVistaAccederAltaCliente().getVistaEjecutarAltaCliente());
		puente.repaint();
		puente.revalidate();

}
}