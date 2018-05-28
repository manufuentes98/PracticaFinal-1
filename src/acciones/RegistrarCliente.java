package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import control.Logica;
import control.Puente;

public class RegistrarCliente implements ActionListener{
	private Puente puente;
	private JPanel panel;
	
	public RegistrarCliente(Puente puente,JPanel panel) {
		super();
		this.puente = puente;
		this.panel=panel;
	}

	public void actionPerformed(ActionEvent e) {
		panel.remove(puente.getPanelCliente());
		panel.add(puente.getVistaAccederAltaCliente());
		panel.add(puente.getVistaAccederBuscarCliente());
		puente.repaint();
		panel.revalidate();
	}
}