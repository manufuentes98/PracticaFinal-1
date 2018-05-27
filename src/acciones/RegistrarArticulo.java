package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import control.Puente;

public class RegistrarArticulo implements ActionListener {
	private Puente puente;
	private JPanel panel;
	
	public RegistrarArticulo(Puente puente,JPanel panel) {
		super();
		this.puente = puente;
		this.panel=panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		panel.remove(puente.getPanelArticulo());
		panel.add(puente.getVistaAccederAltaArticulo());
		panel.add(puente.getVistaAccederBuscarArticulo());
		puente.repaint();
		panel.revalidate();
	}

}