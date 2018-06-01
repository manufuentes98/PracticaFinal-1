package control;

import java.util.regex.Pattern;

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

	public boolean validarCliente(String dni, String nombre, String direccion, String telefono) {
		if (!comprobarVacioCliente(dni, nombre, direccion, telefono)) {
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

	public boolean comprobarVacioCliente(String dni, String nombre, String direccion, String telefono) {
		if (dni.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty()) {
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