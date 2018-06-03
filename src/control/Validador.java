package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import modelo.Cliente;
import vista.VistaEjecutarAltaCliente;

public class Validador {
private Puente puente;

public Validador(Puente puente) {
		super();
		this.puente = puente;
	}
	public boolean validarArticulo(String nombre, String descripcion, String precio) {
		if (!comprobarVacioArticulo(nombre, descripcion, precio) || !comprobarNumeros(precio)) {
			return false;
		} else
			return true;
	}

	public boolean validarCliente(Cliente cliente,ArrayList<Cliente> clientes) {
		boolean retorno = true;
		VistaEjecutarAltaCliente vista = puente.getVistaAccederAltaCliente().getVistaEjecutarAltaCliente();
		if (comprobarVacioCliente(cliente)) {
			vista.getLblComprobacion().setText("ERROR CAMPO VACIO");
			retorno = false;
		}
		if (comprobarSiExiste(cliente,clientes)) {
			vista.getLblComprobacion().setText("ERROR EL CLIENTE YA EXISTE");
			retorno = false ;
		}
		if(comprobarDni(cliente.getDniCif())) {
			vista.getLblComprobacion().setText("ERROR DNI INCORRECTO");
			retorno = false ;
		}
		if(!comprobarNombreNoNumeros(cliente.getRazonSocial())) {
			vista.getLblComprobacion().setText("ERROR NUMEROS EN EL NOMBRE");
			retorno = false ;
		}
		//Y alguna mas que so os ocurra
		return retorno;
		
		
	}
	private boolean comprobarNombreNoNumeros(String razonSocial) {
		// TODO Auto-generated method stub
		return true;
	}
	private boolean comprobarSiExiste(Cliente cliente,ArrayList<Cliente> clientes) {
		boolean retorno =false;
		for (Cliente clienteTemporal : clientes) {
			if (clienteTemporal.equals(cliente))retorno=true;
		}
		return retorno;
	}
	public boolean validarPedido() {
		return true;
	}

	public boolean validarLineaPedido() {
		return true;
	}

	public boolean comprobarVacioArticulo(String nombre, String descripcion, String precio) {
		if (nombre.isEmpty() || descripcion.isEmpty() || precio.isEmpty()) {
			return true;
		} else
			return false;
	}

	private boolean comprobarVacioCliente(Cliente cliente) {
		if (cliente.getDniCif().isEmpty() || cliente.getRazonSocial().isEmpty() ||
				cliente.getDireccion().isEmpty() || cliente.getTelefono().isEmpty()) {
			return true;
		} else
			return false;
	}

	public boolean comprobarNumeros(String precio) {
		char caracter;
		for (int i = 0; i < precio.length(); i++) {
			caracter = precio.charAt(i);

			if (!Character.isDigit(caracter)) {
				return false;
			}
		}
		return true;
	}

	public boolean comprobarTelefono(String telefono) {

		return false;
	}

	public boolean comprobarDni(String dni) {
		return false;
	}

}