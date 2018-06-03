package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import control.Logica;
import control.Puente;
import control.Validador;
import modelo.Cliente;
import utiles.Utiles;

class LogicaTest {

	Puente puente = new Puente();
	@AfterEach
	public void tearDown() throws Exception {
		File carpetaGenerada = new File("./data");
		Utiles.borrarCarpeta(carpetaGenerada);
	}
	void testDarAltaArticulo() {
		fail("Not yet implemented");
	}

	void testBuscarArticulo() {
		fail("Not yet implemented");
	}

	void testModificarPrecio() {
		fail("Not yet implemented");
	}

	@Test
	void testDarAltaCliente() {
		Cliente cliente = new Cliente("123P4", "razonsocial", "calle falsa123", "622556677");
		Cliente cliente2 = new Cliente("1233P4", "animo", "calle falsa123", "622556677");
		assertTrue(puente.getLogica().darAltaCliente(cliente));
		assertTrue(puente.getLogica().darAltaCliente(cliente2));
		assertTrue(puente.getLogica().borrarClientePorNombre("razonsocial"));
		assertTrue(puente.getLogica().borrarClientePorNombre("animo"));
		assertTrue(puente.getLogica().darAltaCliente(cliente));
		assertTrue(puente.getLogica().darAltaCliente(cliente2));
		assertTrue(puente.getLogica().borrarClientePorNif("123P4"));
		assertTrue(puente.getLogica().borrarClientePorNif("1233P4"));
	}

	void testBuscarCliente() {
		fail("Not yet implemented");
	}
	
	@Test
	void testBorrarCliente() {
		Cliente cliente = new Cliente("123P4", "razonsocial", "calle falsa123", "622556677");
		Cliente cliente2 = new Cliente("1233P4", "animo", "calle falsa123", "622556677");
		assertTrue(puente.getLogica().darAltaCliente(cliente));
		assertTrue(puente.getLogica().darAltaCliente(cliente2));
		assertTrue(puente.getLogica().borrarClientePorNombre("razonsocial"));
		assertTrue(puente.getLogica().borrarClientePorNombre("animo"));
		
		assertTrue(puente.getLogica().darAltaCliente(cliente));
		assertTrue(puente.getLogica().darAltaCliente(cliente2));
		
		assertTrue(puente.getLogica().borrarClientePorNif("123P4"));
		assertTrue(puente.getLogica().borrarClientePorNif("1233P4"));
		for (int i = 0; i < puente.getLogica().getDatos().getClientes().size(); i++) {
			System.out.println(puente.getLogica().getDatos().getClientes().get(i));
		}
	}

	void testConsultarPedido() {
		fail("Not yet implemented");
	}

	void testConsultarHistorico() {
		fail("Not yet implemented");
	}

	void testInsertarLineaPedido() {
		fail("Not yet implemented");
	}

}
