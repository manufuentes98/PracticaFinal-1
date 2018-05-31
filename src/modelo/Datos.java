package modelo;

public class Datos {
	public boolean grabarCliente(Cliente cliente) {
		return new DAO<>().grabar("clientes/clientes.data", cliente);
	}
	
}
