package test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import control.Logica;
import control.Puente;
import modelo.Cliente;

class LogicaTest {

	@AfterEach
	public void tearDown() throws Exception {
		File carpetaGenerada = new File("clientes.data");
		carpetaGenerada.delete();
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
		Cliente cliente = new Cliente("123P", "razonsocial", "calle falsa123", "622556677");
		assertTrue(new Logica(new Puente()).darAltaCliente(cliente));
	}

	void testBuscarCliente() {
		fail("Not yet implemented");
	}

	void testBorrarCliente() {
		fail("Not yet implemented");
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
