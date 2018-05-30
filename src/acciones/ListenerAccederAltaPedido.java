package acciones;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Puente;

public class ListenerAccederAltaPedido implements ActionListener {
private Puente puente;

	public ListenerAccederAltaPedido(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		puente.getContentPane().removeAll();
		puente.getContentPane().setLayout(new BorderLayout(0, 0));
		puente.getContentPane().add(puente.getVistaAccederAltaPedido().getVistaEjecutarAltaPedido());
		puente.repaint();
		puente.revalidate();		
	}	
	
}


