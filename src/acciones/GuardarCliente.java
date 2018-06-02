package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Logica;
import control.Puente;
import control.Validador;
import modelo.Cliente;
import utiles.Utiles;
import vista.VistaEjecutarAltaArticulo;
import vista.VistaEjecutarAltaCliente;

public class GuardarCliente implements ActionListener {
	private Puente puente;
	private Validador validador;
	
	public GuardarCliente(Puente puente,Validador validador) {
		super();
		this.puente = puente;
		this.validador = validador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VistaEjecutarAltaCliente vista = puente.getVistaAccederAltaCliente().getVistaEjecutarAltaCliente();

		assert !validador.validarCliente(new Cliente(vista.getTxtDNI().getText(), vista.getTxtNombre().getText(),
				vista.getTxtDireccion().getText(), vista.getTxtTelefono().getText())) : "Error en algun campo";
		Cliente cliente = new Cliente(vista.getTxtDNI().getText(), vista.getTxtNombre().getText(),
				vista.getTxtDireccion().getText(), vista.getTxtTelefono().getText());
		
		vista.getLblComprobacion().setVisible(true);
		if(new Logica(puente).darAltaCliente(cliente)) {
			vista.getTxtDNI().setText("");
			vista.getTxtNombre().setText("");
			vista.getTxtDireccion().setText("");
			vista.getTxtTelefono().setText("");
			vista.getLblComprobacion().setText("cliente creado");
		}
		else {
			vista.getLblComprobacion().setText("ERROR AL CREAR CLIENTE");
		}
		Utiles.actualizar(puente);
		// else {
		// vista.getLblComprobacion().setText("error al crear");
	}
}
