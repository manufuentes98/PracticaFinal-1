package acciones;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Puente;

public class ListenerAccederBorrarCliente implements ActionListener{
	private Puente puente;
	 public ListenerAccederBorrarCliente(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		puente.getContentPane().removeAll();
		puente.getContentPane().setLayout(new BorderLayout(0, 0));
		puente.getContentPane().add(puente.getVistaAccederBorrarCliente().getVistaEjecutarBorrarCliente());
		puente.repaint();
		puente.revalidate();

	}

}
