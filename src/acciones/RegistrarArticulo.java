package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Logica;
import control.Puente;
import control.Validador;
import modelo.Articulo;
import utiles.Utiles;
import vista.VistaEjecutarAltaArticulo;

public class RegistrarArticulo implements ActionListener {

	private Puente puente;
	private Validador validador;

	public RegistrarArticulo(Puente puente, Validador validador) {
		super();
		this.puente = puente;
		this.validador = validador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VistaEjecutarAltaArticulo vista = puente.getVistaEjecutarAltaArticulo();

		assert !this.validador.validarArticulo(vista.getTextNombreAltaArticulo().getText(),
				vista.getTextDescripcionAltaArticulo().getText(),
				vista.getTextPrecio().getText()) : "Error en algun campo";

		if (new Logica(puente).darAltaArticulo(new Articulo(1, vista.getTextNombreAltaArticulo().getText(),
				vista.getTextDescripcionAltaArticulo().getText(), Float.valueOf(vista.getTextPrecio().getText())))) {
			vista.getTextNombreAltaArticulo().setText("");
			vista.getTextDescripcionAltaArticulo().setText("");
			vista.getTextPrecio().setText("");
			vista.getLblMensaje().setText("Articulo creado");
		} else
			vista.getLblMensaje().setText("error al crear");

		Utiles.actualizar(puente);
	}

}