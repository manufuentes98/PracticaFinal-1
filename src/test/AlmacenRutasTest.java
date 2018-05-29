package test;
import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modelo.AlmacenIndice;
import modelo.AlmacenRutas;
import modelo.Articulo;
import modelo.Cliente;

public class AlmacenRutasTest {

	AlmacenRutas<Object> instancia;
	private String baseGrupo = new String ("Producto");
	private Articulo articuloUno;
	private Articulo articuloDos;
	private Articulo articuloTres;
		
	@Before
	public void setUp() {
		instancia = new AlmacenRutas<>("Elementos");
		articuloUno = new Articulo(0, "Paco", "sa matao", 123);
		articuloDos = new Articulo(1, "Pepe", "sa matao pero menos", 321);
		articuloTres = new Articulo(2, "Pepito", "sa matao del to", 213);
	}

	@After
	public void tearDown() throws Exception {
		File carpetaGenerada = new File("./data/Elementos");
		borrarCarpeta(carpetaGenerada);
	}

	private void borrarCarpeta(File carpetaGenerada) {
	    if (carpetaGenerada.isDirectory()) { 
	        for (File f : carpetaGenerada.listFiles()) { 
	        	borrarCarpeta(f);  } 
	    } 
	    carpetaGenerada.delete(); 
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
