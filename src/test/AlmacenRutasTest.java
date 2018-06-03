package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.AlmacenRutas;
import modelo.Articulo;
import utiles.Utiles;

public class AlmacenRutasTest {

	AlmacenRutas<Object> instancia;
	private String baseGrupo = new String ("Producto");
	private Articulo articuloUno;
	private Articulo articuloDos;
	private Articulo articuloTres;
		
	@BeforeEach
	public void setUp() {
		instancia = new AlmacenRutas<>("Elementos");
		articuloUno = new Articulo(0, "Paco", "asdda", 123);
		articuloDos = new Articulo(1, "Pepe", "asdasda", 321);
		articuloTres = new Articulo(2, "Pepito", "asdas", 213);
	}

	@AfterEach
	public void tearDown() throws Exception {
		File carpetaGenerada = new File("./data");
		Utiles.borrarCarpeta(carpetaGenerada);
	}

	@Test
	public void testObtener() {
		assertTrue(instancia.grabar(articuloUno,"0", baseGrupo));
		assertTrue(instancia.grabar(articuloDos,"1", baseGrupo));
		assertTrue(instancia.grabar(articuloTres,"2", baseGrupo));
		assertEquals(instancia.obtener("0",baseGrupo), articuloUno);
		assertEquals(instancia.obtener("1",baseGrupo), articuloDos);
		assertEquals(instancia.obtener("2",baseGrupo), articuloTres);
	}

	@Test
	public void testGrabar() {
		assertTrue(instancia.grabar(articuloUno,"0", baseGrupo));
		assertTrue(instancia.grabar(articuloDos,"1", baseGrupo));
		assertTrue(instancia.grabar(articuloTres,"2", baseGrupo));
	}

}
