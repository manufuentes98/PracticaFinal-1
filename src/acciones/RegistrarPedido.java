package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import control.Puente;
import modelo.Articulo;
import modelo.Pedido;
import vista.VistaEjecutarAltaArticulo;
import vista.VistaEjecutarAltaCliente;
import vista.VistaEjecutarAltaPedido;

public class RegistrarPedido implements ActionListener {
	private Puente puente;

	public RegistrarPedido(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VistaEjecutarAltaCliente vista = puente.getVistaAccederAltaCliente().getVistaEjecutarAltaCliente();

		// assert !puente.getValidador().validarPedido() : "Error en algun
		// campo";

		Pedido p = new Pedido(0, cliente);
		vista.getLblComprobacion().setText("pedido creado");
		// else {
		// vista.getLblMensaje().setText("error al crear");
		System.out.println(p);
	}
}
