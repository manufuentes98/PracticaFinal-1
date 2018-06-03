package test;

import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import modelo.AlmacenIndice;
import modelo.Articulo;
import modelo.Cliente;
import utiles.Utiles;

public class AlmacenIndiceTest {
	private static final String CLIENTES_DAT = "./data/clientes.dat";
	private static final String INDICE_DAT = "./data/indice.dat";
	AlmacenIndice<Articulo, Integer> instancia;
	private Articulo articuloUno;
	private Articulo articuloDos;
	private Articulo articuloTres;

	@BeforeEach
	public void setUp() {
		instancia = new AlmacenIndice<>(INDICE_DAT, CLIENTES_DAT);
		articuloUno = new Articulo(1, "Paco", "sa matao", 123);
		articuloDos = new Articulo(2, "Pepe", "sa matao pero menos", 321);
		articuloTres = new Articulo(3, "Pepito", "sa matao del to", 213);
	}

	@Test
	public void testObtener() {
		// Pruebo que estando vacio no debe retornar nada xq suponemos que no
		// existe
		// el mapa
		assertTrue(instancia.grabar(articuloUno, 0));
		// Que es capaz de obtener un elemento almacenado
		assertEquals(articuloUno, instancia.obtener(0));
		// ahora pruebo que existiendo el mapa no se puede acceder a un elemento
		// que no existe
		assertFalse(instancia.grabar(articuloUno, 0));
		assertTrue(articuloUno.equals(instancia.obtener(0)));
//		assertEquals("juan", instancia.obtener(11).getNombre());
		// que no graba dos con el mismo clave
		assertFalse(instancia.grabar(articuloDos, 0));
		assertTrue(instancia.grabar(articuloDos, 1));
		assertTrue(articuloDos.equals(instancia.obtener(1)));
		// Que el que queda es el valor que ya estaba
//		assertEquals("juan", instancia.obtener(11).getNombre());
	}

	@Test
	public void testGrabar() {
		assertTrue(instancia.grabar(articuloUno, 1));
		assertTrue(instancia.grabar(articuloDos, 2));
		// Pruebo que recupera uno que existe
		assertEquals(articuloUno, instancia.obtener(1));
		// Que no graba duplicado
		assertFalse(instancia.grabar(articuloTres, 1));
		// Hay cosas que no se pueden contratar (assert de contrato)
	}

	@AfterEach
	public void tearDown() throws Exception {
		File carpetaGenerada = new File("./data");
		Utiles.borrarCarpeta(carpetaGenerada);
	}

}
