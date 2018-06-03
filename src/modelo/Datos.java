package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import utiles.Utiles;

public class Datos {
	private ArrayList<Cliente> clientes;
	
	public Datos() {
		super();
		clientes = new ArrayList<>();
		iniciarClientesConFicheroAlmacenado();
	}


	public ArrayList<Cliente> iniciarClientesConFicheroAlmacenado() {
		FileInputStream flujoR = null;
		ObjectInputStream adaptadorR = null;
			try {
				File file = new File(Utiles.RUTACLIENTE);
				flujoR=new FileInputStream(file);
				adaptadorR=new ObjectInputStream(flujoR);
				Cliente cliente = (Cliente) adaptadorR.readObject();
				while (cliente != null) {
					clientes.add(cliente);
				cliente = (Cliente) adaptadorR.readObject();
				}
				adaptadorR.close();
				flujoR.close();
			} catch (IOException | ClassNotFoundException e) {	
				System.out.println("clientes copiados a datos");
			}
		return clientes;
	}

	public boolean grabarCliente(Cliente cliente) {
		this.clientes.add(cliente);
		return new DAO<>().grabar(Utiles.RUTACLIENTE, cliente,true);
	}
	
	public boolean borrarCliente(Cliente cliente) {
		boolean retorno = false;
		if (getClientes().size()>0) {
			getClientes().remove(cliente);
			retorno = true;
		}
		actualizarClientes();
		  if (getClientes().size()<1) {
			  new File(Utiles.RUTACLIENTE).delete();
		  }
		return retorno;
	}

	private void actualizarClientes() {
		new File(Utiles.RUTACLIENTE).delete();
		for (Cliente cliente : clientes) {
			new DAO<>().grabar(Utiles.RUTACLIENTE, cliente,true);
		}
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
}
