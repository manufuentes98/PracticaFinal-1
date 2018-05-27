package control;

import acciones.BorrarCliente;
import acciones.BuscarArticulo;
import acciones.BuscarCliente;
import acciones.ConsultarPedido;
import acciones.ListenerAccederAltaArticulo;
import acciones.ListenerAccederBuscarCliente;
import acciones.ModificarArticulo;
import acciones.RegistrarArticulo;
import acciones.RegistrarCliente;
import acciones.RegistrarPedido;
import vista.VistaPrincipal;

public class Puente extends VistaPrincipal {

	private ConsultarPedido consultarPedido;
	private BuscarArticulo buscadorArticulo;
	private RegistrarCliente registrarCliente;
	private BorrarCliente borrarCliente;
	private ModificarArticulo modificarArticulo;
	private BuscarCliente buscarCliente;
	private RegistrarPedido registrarPedido;
	private RegistrarArticulo registarArticulo;
	private Logica logica;
	private ListenerAccederAltaArticulo listenerAccederAltaArticulo;
	private ListenerAccederBuscarCliente listenerAccederBuscarCliente;

	public void asignarListener() {
		registarArticulo = new RegistrarArticulo(this, this.panel);
		listenerAccederAltaArticulo = new ListenerAccederAltaArticulo(this);
		listenerAccederBuscarCliente = new ListenerAccederBuscarCliente(this);
	}

	public Puente() {
		super();
		asignarListener();
		this.panelArticulo.getBotonArticulo().addActionListener(registarArticulo);
		this.panelArticulo.getVistaAccederAltaArticulo().getBotonAltaArticulo()
				.addActionListener(listenerAccederAltaArticulo);
		this.panelArticulo.getVistaAccederBuscarArticulo().getBotonBuscarArticulo()
				.addActionListener(listenerAccederBuscarCliente);
		this.mntmDarDeAlta.addActionListener(listenerAccederAltaArticulo);
		this.mntmBuscarArticulo.addActionListener(listenerAccederBuscarCliente);
	}

}