package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import control.Puente;
import modelo.Articulo;
import vista.VistaEjecutarAltaArticulo;

public class RegistrarArticulo implements ActionListener {
	private Puente puente;

	public RegistrarArticulo(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VistaEjecutarAltaArticulo vista = puente.getVistaEjecutarAltaArticulo();

		assert puente.getValidador().validarArticulo(vista.getTextNombreAltaArticulo().getText(),
				vista.getTextDescripcionAltaArticulo().getText(), vista.getTextPrecio().getText());

		Articulo a = new Articulo(1, vista.getTextNombreAltaArticulo().getText(),
				vista.getTextDescripcionAltaArticulo().getText(), Float.valueOf(vista.getTextPrecio().getText()));
		vista.getLblMensaje().setText("articulo creado");
		// else {
		// vista.getLblMensaje().setText("error al crear");
		System.out.println(a);
	}

}