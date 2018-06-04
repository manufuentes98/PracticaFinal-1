package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Logica;
import control.Puente;

public class BorrarCliente implements ActionListener{

	public Puente puente;

	public BorrarCliente(Puente puente) {
		this.puente = puente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean retorno = false;
		if(this.puente.getTxtId().getText().isEmpty()) {
			System.out.println("deberia borrar por nombre");
			retorno = this.puente.getLogica().borrarClientePorNombre(String.valueOf(this.puente.getTxtNombre().getText()));
		}
		else if(this.puente.getTxtNombre().getText().isEmpty()){
			System.out.println("deberia borrar por nif");
			retorno = this.puente.getLogica().borrarClientePorNif(String.valueOf(this.puente.getTxtId().getText()));
		}
		
		else {
			System.out.println("deberia borrar por nif");
			retorno = this.puente.getLogica().borrarClientePorNif(String.valueOf(this.puente.getTxtId().getText()));
		}
		if(retorno) {
			this.puente.getVistaAccederBorrarCliente().getLblMensaje().setText("Cliente borrado");
			this.puente.getVistaAccederBorrarCliente().getTxtId().setText("");
			this.puente.getVistaAccederBorrarCliente().getTxtNombre().setText("");
		}
		else {
			this.puente.getVistaAccederBorrarCliente().getLblMensaje().setText("Cliente no encontrado");
		}
		
	}

}