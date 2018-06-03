package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Logica;
import control.Puente;

public class BorrarCliente implements ActionListener{

	public Logica logica;

	public Puente puente;

	public BorrarCliente(Puente puente) {
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}