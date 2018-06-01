package modelo;

public class Datos {
	
	
	public Datos() {
		super();
	}

	public boolean grabarCliente(Cliente cliente) {
		return new DAO<>().grabar("clientes.data", cliente,true);
	}
	
}
