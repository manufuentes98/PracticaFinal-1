package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Puente;
import modelo.Linea;
import modelo.Pedido;
import vista.VistaEjecutarAltaCliente;

public class AddLinea implements ActionListener {
	private Puente puente;

	public AddLinea(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		VistaEjecutarAltaCliente vista = puente.getVistaAccederAltaCliente().getVistaEjecutarAltaCliente();
		Linea l = new Linea(articulo, 0);
		vista.getLblComprobacion().setText("linea añadida");
		// else {
		// vista.getLblMensaje().setText("error al crear");
		System.out.println(l);

	}

}
