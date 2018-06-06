package acciones;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Puente;
import utiles.Utiles;

public class ListenerPedido implements ActionListener {
		private Puente puente;

		public ListenerPedido(Puente puente) {
			super();
			this.puente = puente;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			puente.getPanelPedido().removeAll();
			puente.getPanelPedido().setLayout(new GridLayout(2, 0, 0, 0));
			puente.getPanelPedido().add(puente.getVistaAccederAltaPedido());
			puente.getPanelPedido().add(puente.getVistaAccederPedido());
			Utiles.actualizar(puente);
		}
	}

