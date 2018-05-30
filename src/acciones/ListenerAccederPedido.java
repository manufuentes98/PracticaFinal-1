package acciones;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Puente;

public class ListenerAccederPedido implements ActionListener  {
public ListenerAccederPedido(Puente puente) {
		super();
		this.puente = puente;
	}
private Puente puente;
	@Override
	public void actionPerformed(ActionEvent e) {
		puente.getContentPane().removeAll();
		puente.getContentPane().setLayout(new BorderLayout(0, 0));
		puente.getContentPane().add(puente.getVistaAccederPedido().getVistaEjecutarPedido());
		puente.repaint();
		puente.revalidate();			
	}

}
