package control;

import javax.swing.JPanel;

import acciones.BorrarCliente;
import acciones.BuscarArticulo;
import acciones.BuscarCliente;
import acciones.ConsultarPedido;
import acciones.ListenerAccederAltaArticulo;
import acciones.ListenerAccederAltaClientee;
import acciones.ListenerAccederBorrarCliente;
import acciones.ListenerAccederBuscarArticulo;
import acciones.ListenerAccederBuscarCliente;
import acciones.ListenerMainArticulo;
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
	private ListenerMainArticulo listenerMainArticulo;
	private ListenerAccederAltaArticulo listenerAccederAltaArticulo;
	private ListenerAccederBuscarArticulo listenerAccederBuscarArticulo;
	private ListenerAccederAltaClientee listenerAccederAltaCliente;
	private ListenerAccederBuscarCliente listenerAccederBuscarCliente;
	private ListenerAccederBorrarCliente listenerAccederBorrarCliente;
	private JPanel panel;


	public void asignarListener() {
		listenerMainArticulo = new ListenerMainArticulo(this);
		listenerAccederAltaArticulo = new ListenerAccederAltaArticulo(this);
		listenerAccederBuscarArticulo = new ListenerAccederBuscarArticulo(this);
		listenerAccederAltaCliente = new ListenerAccederAltaClientee(this);
		listenerAccederBuscarCliente = new ListenerAccederBuscarCliente(this);
		listenerAccederBorrarCliente  = new ListenerAccederBorrarCliente(this);
		registrarCliente = new RegistrarCliente(this, this.panel);
	}

	public Puente() {
		super();
		asignarListener();
		this.panelArticulo.getBotonArticulo().addActionListener(listenerMainArticulo);
		this.panelArticulo.getVistaAccederAltaArticulo().getBotonAltaArticulo()
				.addActionListener(listenerAccederAltaArticulo);
		this.panelArticulo.getVistaAccederBuscarArticulo().getBotonBuscarArticulo()
				.addActionListener(listenerAccederBuscarArticulo);
		this.mntmDarDeAlta.addActionListener(listenerAccederAltaArticulo);
		this.mntmBuscarArticulo.addActionListener(listenerAccederBuscarArticulo);
		
		this.panelCliente.getBotonCliente().addActionListener(registrarCliente);
		this.panelCliente.getVistaAccederAltaCliente().getBtnAltaCliente()
				.addActionListener(listenerAccederAltaCliente);
		this.panelCliente.getVistaAccederBuscarCliente().getBtnBuscarCliente()
				.addActionListener(listenerAccederBuscarCliente);
		this.panelCliente.getVistaAccederBorrarCliente().getBtnBorrarCliente()
				.addActionListener(listenerAccederBorrarCliente);
	}

}