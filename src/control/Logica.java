package control;
import java.util.ArrayList;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Datos;
import modelo.Pedido;


public class Logica {
	private Datos datos;
	
		public Logica() {
		super();
		this.datos = new Datos();
		}



public Boolean darAltaArticulo(Articulo articulo) {
	  
	  return null;
  }

  public Articulo buscarArticulo() {
  return null;
  }

  public Boolean modificarPrecio() {
  return null;
  }

  public Boolean darAltaCliente(Cliente cliente) {

	  return datos.grabarCliente(cliente);
  }

  public Cliente buscarCliente(String nif) {
	  for (int i = 0; i < datos.getClientes().size(); i++) {
			Cliente clienteTemporal = datos.getClientes().get(i);
			if(clienteTemporal.getDniCif().equals(nif)) {
				return(clienteTemporal);
			}
		  }
	  return null;
  }

  public boolean borrarClientePorNombre(String nombre) {
	  boolean retorno = false;
	  for (int i = 0; i < datos.getClientes().size(); i++) {
		Cliente clienteTemporal = datos.getClientes().get(i);
		if(clienteTemporal.getRazonSocial().equals(nombre)) {
			datos.borrarCliente(clienteTemporal);
			retorno = true;
		}
	  }
	return retorno;
  }
  
  public Boolean borrarClientePorNif(String nif) {
	  boolean retorno = false;
	  for (int i = 0; i < datos.getClientes().size(); i++) {
		Cliente clienteTemporal = datos.getClientes().get(i);
		if(clienteTemporal.getDniCif().equals(nif)) {
			datos.borrarCliente(clienteTemporal);
			retorno = true;
		}
	  }
	return retorno;
	  }

  private Boolean darAltaPedido() {
  return null;
  }

  public Pedido consultarPedido() {
  return null;
  }

  public ArrayList consultarHistorico() {
  return null;
  }

  public Boolean insertarLineaPedido() {
  return null;
  }



public Datos getDatos() {
	return datos;
}



public void setDatos(Datos datos) {
	this.datos = datos;
}

}