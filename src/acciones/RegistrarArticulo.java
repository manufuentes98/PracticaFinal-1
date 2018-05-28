package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import control.Puente;

public class RegistrarArticulo implements ActionListener {
	private Puente puente;
	
	public RegistrarArticulo(Puente puente,JPanel panel) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		puente.getTextNombreAltaArticulo();
//		puente.getTextDescripcionAltaArticulo();
//		puente.repaint();
//		puente.revalidate();
	}

}