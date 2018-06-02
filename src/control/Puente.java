package control;

import javax.swing.JPanel;

import acciones.BorrarCliente;
import acciones.BuscarArticulo;
import acciones.BuscarCliente;
import acciones.ConsultarPedido;
import acciones.GuardarCliente;
import acciones.ListenerAccederAltaArticulo;
import acciones.ListenerAccederAltaCliente;
import acciones.ListenerAccederAltaPedido;
import acciones.ListenerAccederBorrarCliente;
import acciones.ListenerAccederBuscarArticulo;
import acciones.ListenerAccederBuscarCliente;
import acciones.ListenerAccederPedido;
import acciones.ListenerMainArticulo;
import acciones.ListenerMainPedido;
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
	private Validador validador;
	private ListenerMainArticulo listenerMainArticulo;
	private ListenerAccederAltaArticulo listenerAccederAltaArticulo;
	private ListenerAccederBuscarArticulo listenerAccederBuscarArticulo;
	private ListenerAccederAltaCliente listenerAccederAltaCliente;
	private ListenerAccederBuscarCliente listenerAccederBuscarCliente;
	private ListenerAccederBorrarCliente listenerAccederBorrarCliente;
	private ListenerAccederAltaPedido listenerAccederAltaPedido;
	private ListenerAccederPedido listenerAccederPedido;
	private ListenerMainPedido listenerMainPedido;
	private GuardarCliente guardarCliente;

	public Puente() {
		super();
		inicializarListeners();
		validador = new Validador(this);
		asignarListeners();
		this.logica = new Logica(this);
		}

	private void asignarListeners() {
		this.getBotonArticulo().addActionListener(listenerMainArticulo);
		this.panelArticulo.getBotonAltaArticulo().addActionListener(listenerAccederAltaArticulo);
		this.panelArticulo.getBotonBuscarArticulo().addActionListener(listenerAccederBuscarArticulo);
		this.mntmDarDeAlta.addActionListener(listenerAccederAltaArticulo);
		this.mntmBuscarArticulo.addActionListener(listenerAccederBuscarArticulo);
		this.getVistaEjecutarAltaArticulo().getBtnGuardar().addActionListener((registarArticulo));
		this.panelCliente.getBotonCliente().addActionListener(registrarCliente);
		this.panelCliente.getBtnAltaCliente().addActionListener(listenerAccederAltaCliente);
		this.panelCliente.getBtnBorrarCliente().addActionListener(listenerAccederBorrarCliente);
		this.panelCliente.getBtnBuscarCliente().addActionListener(listenerAccederBuscarCliente);
		this.mntmBuscarCliente.addActionListener(listenerAccederBuscarCliente);
		this.mntmDarAltaCliente.addActionListener(listenerAccederAltaCliente);
		this.getVistaAccederAltaCliente().getVistaEjecutarAltaCliente().getBtnValidar().addActionListener(guardarCliente);

		this.panelCliente.getBtnBuscarCliente().addActionListener(listenerAccederBuscarCliente);
		this.panelPedido.getBotonPedido().addActionListener(registrarPedido);
		this.panelPedido.getBtnAccederAltaPedido().addActionListener(listenerAccederAltaPedido);
		this.panelPedido.getBtnConsultarPedidos().addActionListener(listenerAccederPedido);
		this.panelPedido.getBotonPedido().addActionListener(listenerMainPedido);
		this.mntmBuscarPedido.addActionListener(listenerAccederPedido);
		this.mntmNuevoPedido.addActionListener(listenerAccederAltaPedido);

	}

	private void inicializarListeners() {
		listenerMainArticulo = new ListenerMainArticulo(this);
		listenerAccederAltaArticulo = new ListenerAccederAltaArticulo(this);
		listenerAccederBuscarArticulo = new ListenerAccederBuscarArticulo(this);
		listenerAccederAltaCliente = new ListenerAccederAltaCliente(this);
		listenerAccederBuscarCliente = new ListenerAccederBuscarCliente(this);
		listenerAccederBorrarCliente = new ListenerAccederBorrarCliente(this);
		registrarCliente = new RegistrarCliente(this);
		listenerAccederAltaPedido = new ListenerAccederAltaPedido(this);
		listenerAccederPedido = new ListenerAccederPedido(this);
		registrarPedido = new RegistrarPedido(this);
		listenerMainPedido = new ListenerMainPedido(this);
		registarArticulo = new RegistrarArticulo(this,validador);
		guardarCliente = new GuardarCliente(this,validador);
	}
}