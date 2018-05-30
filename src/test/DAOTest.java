package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.File;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import modelo.Articulo;
import modelo.DAO;

class DAOTest {
	private String baseGrupo = new String ("Producto");
	private Articulo articuloUno = new Articulo(0, "Paco", "sa matao", 123);;
	private Articulo articuloDos=new Articulo(1, "Pepe", "sa matao pero menos", 321);
	private Articulo articuloTres=new Articulo(2, "Pepito", "sa matao del to", 213);
	private DAO<Object, Integer> instancia = new DAO<>();

	
	@After
	public void tearDown() throws Exception {
		File carpetaGenerada = new File("data");
		borrarCarpeta(carpetaGenerada);
	}
	
	@Test
	void testLeerConIndice() {
		assertTrue(instancia.grabar(articuloUno, Integer.valueOf(0)));
		// Que es capaz de obtener un elemento almacenado
		assertEquals(articuloUno, instancia.leer(0));
		// ahora pruebo que existiendo el mapa no se puede acceder a un elemento
		// que no existe
		assertFalse(instancia.grabar(articuloUno, 0));
		assertTrue(articuloUno.equals(instancia.leer(0)));
//		assertEquals("juan", instancia.obtener(11).getNombre());
		// que no graba dos con el mismo clave
		assertFalse(instancia.grabar(articuloDos, 0));
		assertTrue(instancia.grabar(articuloDos, 1));
		assertTrue(articuloDos.equals(instancia.leer(1)));
	}

	@Test
	void testGrabarConIndice() {
		assertTrue(instancia.grabar(articuloUno, 1));
		assertTrue(instancia.grabar(articuloDos, 2));
		// Pruebo que recupera uno que existe
		assertEquals(articuloUno, instancia.leer(1));
		// Que no graba duplicado
		assertFalse(instancia.grabar(articuloTres, 1));
		// Hay cosas que no se pueden contratar (assert de contrato)
	}

	@Test
	void testGrabarRuta() {
		assertTrue(instancia.grabar(articuloUno,"0", baseGrupo));
		assertTrue(instancia.grabar(articuloDos,"1", baseGrupo));
		assertTrue(instancia.grabar(articuloTres,"2", baseGrupo));
	}
	
	@Test
	void testLeerRuta() {
		assertTrue(instancia.grabar(articuloUno,"0", baseGrupo));
		assertTrue(instancia.grabar(articuloDos,"1", baseGrupo));
		assertTrue(instancia.grabar(articuloTres,"2", baseGrupo));
		assertEquals(instancia.leer("0", baseGrupo),articuloUno);
		assertEquals(instancia.leer("1", baseGrupo),articuloDos);
		assertEquals(instancia.leer("2", baseGrupo),articuloTres);
	}

	@Test
	void testGrabarContiguosFicheroUnico() {
		assertTrue(instancia.grabar("data/articulo",articuloUno,true));
		assertTrue(instancia.grabar("data/articulo",articuloDos,true));
		assertTrue(instancia.grabar("data/articulo",articuloTres,true));
	}
	
	@Test
	void testLeerContiguosFicheroUnico() {
		assertTrue(instancia.grabar("data/articulo",articuloUno,true));
		assertTrue(instancia.grabar("data/articulo",articuloDos,true));
		assertTrue(instancia.grabar("data/articulo",articuloTres,true));
		assertEquals(instancia.leer(0),articuloUno);
		assertEquals(instancia.leer(1),articuloDos);
		assertEquals(instancia.leer(2),articuloTres);
	}
	
	@Test
	void testGrabarUnico() {
		assertTrue(instancia.grabar("data/articulo",articuloUno));
		assertTrue(instancia.grabar("data/articulo",articuloDos));
		assertTrue(instancia.grabar("data/articulo",articuloTres));
	}
	
	@Test
	void testLeerUnico() {
		assertTrue(instancia.grabar("data/articulo",articuloUno));
		assertTrue(instancia.grabar("data/articulo",articuloDos));
		assertTrue(instancia.grabar("data/articulo",articuloTres));
		assertEquals(instancia.leer("data/articulo"),articuloUno);
		assertEquals(instancia.leer("data/articulo"),articuloDos);
		assertEquals(instancia.leer("data/articulo"),articuloTres);
	}
	private void borrarCarpeta(File carpetaGenerada) {
	    if (carpetaGenerada.isDirectory()) { 
	        for (File f : carpetaGenerada.listFiles()) { 
	        	borrarCarpeta(f);  } 
	    } 
	    carpetaGenerada.delete(); 
	}
}
