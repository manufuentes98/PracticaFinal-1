package acciones;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.rmi.CORBA.Util;

import control.Puente;
import utiles.Utiles;

public class ListenerAccederAltaPedido implements ActionListener {
private Puente puente;

	public ListenerAccederAltaPedido(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		puente.getContentPane().removeAll();
		puente.getContentPane().setLayout(new GridLayout(1, 1, 0, 0));
		puente.getContentPane().add(puente.getVistaEjecutarAltaPedido());
		Utiles.actualizar(puente);		
	}	
	
}


