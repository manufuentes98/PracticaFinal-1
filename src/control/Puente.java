package control;

import acciones.BorrarCliente;
import acciones.BuscarArticulo;
import acciones.BuscarCliente;
import acciones.ConsultarPedido;
import acciones.ModificarArticulo;
import acciones.RegistrarCliente;
import acciones.RegistrarPedido;
import vista.VistaPrincipal;

public class Puente extends  VistaPrincipal {

  public ConsultarPedido consultarPedido;

  public BuscarArticulo buscadorArticulo ;

  public RegistrarCliente registrarCliente ;

  public BorrarCliente borrarCliente ;

  public ModificarArticulo modificarArticulo;

  public  BuscarCliente buscarCliente;

  public RegistrarPedido registrarPedido ;

                           
  public void asignarListener() {
  }

}