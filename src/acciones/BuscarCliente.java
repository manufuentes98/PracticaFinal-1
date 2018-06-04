package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import control.Logica;
import control.Puente;
import modelo.Cliente;
import utiles.Utiles;

public class BuscarCliente implements ActionListener{

  public Puente puente;

public BuscarCliente(Puente puente) {
	this.puente = puente;
}

@Override
public void actionPerformed(ActionEvent e) {
	
	ArrayList<Cliente> clientes = this.puente.getLogica().getDatos().getClientes();
	for (int i = 0; i < clientes.size(); i++) {
		Cliente clienteAux = this.puente.getLogica().getDatos().getClientes().get(i);
		String adicion[]={clienteAux.getDniCif(),clienteAux.getRazonSocial(),clienteAux.getDireccion(),clienteAux.getTelefono()};
		//addrow al default
		this.puente.getModeloTabla().addRow(adicion);
		Utiles.actualizar(puente);
	}
}

}