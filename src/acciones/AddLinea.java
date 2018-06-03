package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Logica;
import control.Puente;
import control.Validador;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Linea;
import modelo.Pedido;
import vista.VistaEjecutarAltaCliente;
import vista.VistaEjecutarAltaPedido;

public class AddLinea implements ActionListener {
	private Puente puente;
	private Validador validador;
	private Pedido pedido;

	public AddLinea(Puente puente, Validador validador) {
		super();
		this.puente = puente;
		this.validador = validador;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		VistaEjecutarAltaPedido vista = puente.getVistaAccederAltaPedido().getVistaEjecutarAltaPedido();

		Logica logica = puente.getLogica();
		logica.setPedidoTemporal(new Pedido(getIdPedido(), (Cliente) vista.getComboBoxCliente().getSelectedItem()));
		pedido = logica.getPedidoTemporal();

		Linea linea = new Linea((Articulo) vista.getComboBoxArticulo().getSelectedItem(),
				Integer.valueOf(vista.getTextCantidad().getText()));
		pedido.insertarLinea(linea);
		vista.getLblMensaje().setText("linea añadida");
		// else {
		// vista.getLblMensaje().setText("error al crear");
		
		logica.setPedidoTemporal(pedido);
		System.out.println(linea);

	}

	private int idPedido = 0;

	public int getIdPedido() {
		this.idPedido = this.idPedido + 1;
		return idPedido;
	}

	public int disminuirId() {
		this.idPedido = this.idPedido - 1;
		return idPedido;
	}

}
