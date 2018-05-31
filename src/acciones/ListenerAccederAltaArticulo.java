package acciones;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import control.Puente;

public class ListenerAccederAltaArticulo implements ActionListener {
	private Puente puente;

	public ListenerAccederAltaArticulo(Puente puente) {
		super();
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		puente.getContentPane().removeAll();
		puente.getContentPane().add(puente.getVistaEjecutarAltaArticulo());
		SwingUtilities.updateComponentTreeUI(puente);

	}

}
