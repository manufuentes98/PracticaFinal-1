package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import control.Puente;
import control.Validador;
import modelo.Articulo;
import vista.VistaEjecutarAltaArticulo;

public class RegistrarArticulo implements ActionListener {
	private Puente puente;
	private Validador validador;

	public RegistrarArticulo(Puente puente,Validador validador) {
		super();
		this.puente = puente;
		this.validador = validador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VistaEjecutarAltaArticulo vista = puente.getVistaEjecutarAltaArticulo();

		assert !validador.validarArticulo(vista.getTextNombreAltaArticulo().getText(),
				vista.getTextDescripcionAltaArticulo().getText(), vista.getTextPrecio().getText()) : "Error en algun campo";

		Articulo a = new Articulo(1, vista.getTextNombreAltaArticulo().getText(),
				vista.getTextDescripcionAltaArticulo().getText(), Float.valueOf(vista.getTextPrecio().getText()));
		vista.getLblMensaje().setText("articulo creado");
		// else {
		// vista.getLblMensaje().setText("error al crear");
		System.out.println(a);
	}

}