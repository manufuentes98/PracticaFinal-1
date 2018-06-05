package acciones;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import control.Puente;
import modelo.Cliente;
import vista.VistaEjecutarBuscarArticulo;

public class BuscarArticulo implements KeyListener {

	private	 Puente puente;
	private String cadena;

	public BuscarArticulo(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		VistaEjecutarBuscarArticulo vista = puente.getVistaEjecutarBuscarArticulo();
		cadena = vista.getTextBuscarBuscarArticulo().getText();
		System.out.println(cadena);

		while (this.puente.getVistaEjecutarBuscarArticulo().getModeloTablaArticulo().getRowCount() > 0) {
			this.puente.getVistaEjecutarBuscarArticulo().getModeloTablaArticulo().removeRow(0);
		}

		/*ArrayList<Cliente> clientes = this.puente.getLogica().getDatos().getClientes();

		for (int i = 0; i < clientes.size(); i++) {
			Cliente clienteAux = this.puente.getLogica().getDatos().getClientes().get(i);
			String adicion[] = { clienteAux.getRazonSocial(), clienteAux.getDniCif(), clienteAux.getDireccion(),
					clienteAux.getTelefono() };
			if (adicion[0].toLowerCase().startsWith(cadena.toString())) {
				this.puente.getModeloTabla().addRow(adicion);
			}

		}*/
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}