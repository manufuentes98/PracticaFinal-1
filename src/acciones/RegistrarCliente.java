package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import control.Puente;
import modelo.Cliente;
import vista.VistaEjecutarAltaCliente;

public class RegistrarCliente implements ActionListener {
	private Puente puente;

	public RegistrarCliente(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VistaEjecutarAltaCliente vista = puente.getVistaAccederAltaCliente().getVistaEjecutarAltaCliente();

		assert !puente.getValidador().validarCliente(vista.getTxtDNI().getText(), vista.getTxtNombre().getText(),
				vista.getTxtDireccion().getText(), vista.getTxtTelefono().getText()) : "Error en algun campo";

		Cliente c = new Cliente(vista.getTxtDNI().getText(), vista.getTxtNombre().getText(),
				vista.getTxtDireccion().getText(), vista.getTxtTelefono().getText());
		vista.getLblComprobacion().setText("cliente creado");
		// else {
		// vista.getLblComprobacion().setText("error al crear");
		System.out.println(c);

	}
}