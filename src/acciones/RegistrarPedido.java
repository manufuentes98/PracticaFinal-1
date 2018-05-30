package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import control.Puente;

public class RegistrarPedido implements ActionListener {
	private Puente puente;
	public RegistrarPedido(Puente puente) {
		super();
		this.puente= puente;
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//panel.remove(puente.getPanelPedido());
		//panel.add(puente.getVistaAccederAltaPedido());
		//panel.add(puente.getVistaAccederPedido());
		//puente.repaint();
		//panel.revalidate();
	}
	
}

