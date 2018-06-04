package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import control.Puente;
import utiles.Utiles;
import vista.VistaEjecutarBuscarCliente;

public class ListenerAccederBuscarCliente implements ActionListener{

	private Puente puente;
	private VistaEjecutarBuscarCliente vistaEjecutarBuscarCliente;

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

	public VistaEjecutarBuscarCliente getVistaEjecutarBuscarCliente() {
		return vistaEjecutarBuscarCliente;
	}

	public void setVistaEjecutarBuscarCliente(VistaEjecutarBuscarCliente vistaEjecutarBuscarCliente) {
		this.vistaEjecutarBuscarCliente = vistaEjecutarBuscarCliente;
	}


}
