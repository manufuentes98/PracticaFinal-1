package modelo;

public class Datos {
	
	
	public Datos() {
		super();
	}

	public boolean grabarCliente(Cliente cliente) {
		return new DAO<>().grabar("data/clientes.data", cliente,true);
	}
//	public boolean grabarArticulo(Articulo articulo) {
//		return new DAO<>().grabar("data/articulos.data", articulo);
//	}
	
}
