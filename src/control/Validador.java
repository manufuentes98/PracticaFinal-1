package control;

import java.util.regex.Pattern;

import modelo.Cliente;

public class Validador {
public Validador() {
		super();
	}
	public boolean validarArticulo(String nombre, String descripcion, String precio) {
		if (!comprobarVacioArticulo(nombre, descripcion, precio) || !comprobarNumeros(precio)) {
			return false;
		} else
			return true;
	}

	public boolean validarCliente(Cliente cliente) {
		if (!comprobarVacioCliente(cliente)) {
			return false;
		} else
			return true;
	}
	public boolean validarPedido() {
		return false;
	}

	public boolean validarLineaPedido() {
		return false;
	}

	public boolean comprobarVacioArticulo(String nombre, String descripcion, String precio) {
		if (nombre.isEmpty() || descripcion.isEmpty() || precio.isEmpty()) {
			return true;
		} else
			return false;
	}

	private boolean comprobarVacioCliente(Cliente cliente) {
		if (!cliente.getDniCif().isEmpty() && !cliente.getRazonSocial().isEmpty() &&
				!cliente.getDireccion().isEmpty() && !cliente.getTelefono().isEmpty()) {
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