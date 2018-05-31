package control;

public class Validador {

	public boolean validarCliente() {
		return false;
	}

	public boolean validarArticulo(String nombre, String descripcion, String precio) {
		if (!comprobarVacio(nombre, descripcion, precio)||!comprobarNumeros(precio)) {
			return false;
		}else return true;
	}

	public boolean validarPedido() {
		return false;
	}

	public boolean validarLineaPedido() {
		return false;
	}

	public boolean comprobarVacio(String nombre, String descripcion, String precio) {
		if (nombre.isEmpty() || descripcion.isEmpty() || precio.isEmpty()) {
			return true;
		}
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
}