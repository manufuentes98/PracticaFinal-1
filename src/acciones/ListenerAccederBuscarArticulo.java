package acciones;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Puente;

public class ListenerAccederBuscarArticulo implements ActionListener {
	private Puente puente;

	public ListenerAccederBuscarArticulo(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		puente.getContentPane().removeAll();
		puente.getContentPane().setLayout(new BorderLayout(0, 0));
		puente.getContentPane().add(puente.getVistaEjecutarBuscarArticulo());
		puente.repaint();
		puente.revalidate();

	}

}
