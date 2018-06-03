package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import control.Logica;
import control.Puente;
import control.Validador;
import modelo.Pedido;
import vista.VistaEjecutarAltaPedido;

public class RegistrarPedido implements ActionListener {

	private Puente puente;

	public RegistrarPedido(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VistaEjecutarAltaPedido vista = puente.getVistaEjecutarAltaPedido();
		// assert !puente.getValidador().validarPedido() : "Error en algun
		// campo";
		Logica logica = puente.getLogica();
		Pedido pedido = logica.getPedidoTemporal();
		vista.getLblMensaje().setText("pedido creado");
		// else {
		// vista.getLblMensaje().setText("error al crear");
	}
}
