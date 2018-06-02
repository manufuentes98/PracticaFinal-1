package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.File;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Articulo;
import modelo.DAO;

class DAOTest {
	private static final String RUTA = "./data/articulo4.dat";
	private Articulo articuloUno;
	private Articulo articuloDos;
	private Articulo articuloTres;
	@BeforeEach 
	public void tearUp() throws Exception {
		articuloUno = new Articulo(0, "Paco", "asd", 123);;
		articuloDos=new Articulo(1, "Pepe", "dsas", 321);
		articuloTres=new Articulo(2, "Pepito", "asdasd", 213);
	}
	
	@AfterEach
	public void tearDown() throws Exception {
		File carpetaGenerada = new File("./data");
		borrarCarpeta(carpetaGenerada);
	}
	
	@Test
	void testLeerString() {
		assertTrue(new DAO<>().grabar(RUTA+"1",articuloUno));
		assertTrue(new DAO<>().grabar(RUTA+"2",articuloDos));
		assertTrue(new DAO<>().grabar(RUTA+"3",articuloTres));
		assertEquals(new DAO<>().leer(RUTA+"1"),articuloUno);
		assertEquals(new DAO<>().leer(RUTA+"2"),articuloDos);
		assertEquals(new DAO<>().leer(RUTA+"3"),articuloTres);
	}

	@Test
	void testLeerStringInt() {
		assertTrue(new DAO<>().grabar(RUTA,articuloUno,true));
		assertTrue(new DAO<>().grabar(RUTA,articuloDos,true));
		assertTrue(new DAO<>().grabar(RUTA,articuloTres,true));
		assertEquals(new DAO<>().leer(RUTA,0),articuloUno);
		assertEquals(new DAO<>().leer(RUTA,1),articuloDos);
		assertEquals(new DAO<>().leer(RUTA,2),articuloTres);
	}

	@Test
	void testGrabarStringObject() {
		assertTrue(new DAO<>().grabar(RUTA+"1",articuloUno));
		assertTrue(new DAO<>().grabar(RUTA+"2",articuloDos));
		assertTrue(new DAO<>().grabar(RUTA+"3",articuloTres));
	}

	@Test
	void testGrabarStringObjectBoolean() {
		assertTrue(new DAO<>().grabar(RUTA,articuloUno,true));
		assertTrue(new DAO<>().grabar(RUTA,articuloDos,true));
		assertTrue(new DAO<>().grabar(RUTA,articuloTres,true));
	}
	private void borrarCarpeta(File carpetaGenerada) {
	    if (carpetaGenerada.isDirectory()) { 
	        for (File f : carpetaGenerada.listFiles()) { 
	        	borrarCarpeta(f);  } 
	    } 
	    carpetaGenerada.delete(); 
	}
}
