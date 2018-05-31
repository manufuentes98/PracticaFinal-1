package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.File;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Articulo;
import modelo.DAO;

class DAOTest {
	private String baseGrupo = new String ("Producto");
	private Articulo articuloUno = new Articulo(0, "Paco", "sa matao", 123);;
	private Articulo articuloDos=new Articulo(1, "Pepe", "sa matao pero menos", 321);
	private Articulo articuloTres=new Articulo(2, "Pepito", "sa matao del to", 213);
	private DAO<Object, Integer> instancia = new DAO<>();

	@BeforeEach 
	public void tearUp() throws Exception {
		articuloUno = new Articulo(0, "Paco", "asd", 123);;
		articuloDos=new Articulo(1, "Pepe", "dsas", 321);
		articuloTres=new Articulo(2, "Pepito", "asdasd", 213);
	}
	
	@AfterEach
	public void tearDown() throws Exception {
		File carpetaGenerada = new File("data");
		borrarCarpeta(carpetaGenerada);
		File articulo1 = new File("articulo1.dat");
		File articulo2 = new File("articulo2.dat");
		File articulo3 = new File("articulo3.dat");
		File articulo4 = new File("articulo4.dat");
		articulo1.delete();
		articulo2.delete();
		articulo3.delete();
		articulo4.delete();
		File indice0 = new File("0");
		File indice1 = new File(String.valueOf('1'));
		File datosIndice = new File("modelo.Articulo");
		indice1.delete();
		indice0.delete();
		datosIndice.delete();
	}
	@Test
	void testLeerConIndice() {
		assertTrue(instancia.grabar(articuloUno, Integer.valueOf(0)));
		assertEquals(articuloUno, instancia.leer(Integer.valueOf(0)));
		assertFalse(instancia.grabar(articuloUno, Integer.valueOf(0)));
		assertTrue(articuloUno.equals(instancia.leer(Integer.valueOf(0))));
		assertFalse(instancia.grabar(articuloDos, Integer.valueOf(0)));
		assertTrue(instancia.grabar(articuloDos, Integer.valueOf(1)));
		assertTrue(articuloDos.equals(instancia.leer(Integer.valueOf(1))));
	}
	@Test
	void testGrabarConIndice() {
		assertTrue(instancia.grabar(articuloUno, 0));
		assertEquals(articuloUno, instancia.leer(0));
		assertFalse(instancia.grabar(articuloUno, 0));
		assertTrue(articuloUno.equals(instancia.leer(0)));
		assertFalse(instancia.grabar(articuloDos, 0));
		assertTrue(instancia.grabar(articuloDos, 1));
		assertTrue(articuloDos.equals(instancia.leer(1)));
	}

	@Test
	void testGrabarRuta() {
		assertTrue(instancia.grabar(articuloUno,baseGrupo, "0"));
		assertTrue(instancia.grabar(articuloDos,baseGrupo,"1"));
		assertTrue(instancia.grabar(articuloTres,baseGrupo,"2"));
	}
	
	@Test
	void testLeerRuta() {
		assertTrue(instancia.grabar(articuloUno,baseGrupo, "0"));
		assertTrue(instancia.grabar(articuloDos,baseGrupo,"1"));
		assertTrue(instancia.grabar(articuloTres,baseGrupo,"2"));
		assertEquals(instancia.leer("0", baseGrupo),articuloUno);
		assertEquals(instancia.leer("1", baseGrupo),articuloDos);
		assertEquals(instancia.leer("2", baseGrupo),articuloTres);
	}

	@Test
	void testGrabarContiguosFicheroUnico() {
		assertTrue(instancia.grabar("articulo4.dat",articuloUno,true));
		assertTrue(instancia.grabar("articulo4.dat",articuloDos,true));
		assertTrue(instancia.grabar("articulo4.dat",articuloTres,true));
	}
	
	@Test
	void testLeerContiguosFicheroUnico() {
		assertTrue(instancia.grabar("articulo4.dat",articuloUno,true));
		assertTrue(instancia.grabar("articulo4.dat",articuloDos,true));
		assertTrue(instancia.grabar("articulo4.dat",articuloTres,true));
		assertEquals(instancia.leer("articulo4.dat",0),articuloUno);
		assertEquals(instancia.leer("articulo4.dat",1),articuloDos);
		assertEquals(instancia.leer("articulo4.dat",2),articuloTres);
	}
	
	@Test
	void testGrabarUnico() {
		assertTrue(instancia.grabar("articulo1.dat",articuloUno));
		assertTrue(instancia.grabar("articulo2.dat",articuloDos));
		assertTrue(instancia.grabar("articulo3.dat",articuloTres));
	}
	
	@Test
	void testLeerUnico() {
		assertTrue(instancia.grabar("articulo1.dat",articuloUno));
		assertTrue(instancia.grabar("articulo2.dat",articuloDos));
		assertTrue(instancia.grabar("articulo3.dat",articuloTres));
		assertEquals(instancia.leer("articulo1.dat"),articuloUno);
		assertEquals(instancia.leer("articulo2.dat"),articuloDos);
		assertEquals(instancia.leer("articulo3.dat"),articuloTres);
	}
	private void borrarCarpeta(File carpetaGenerada) {
	    if (carpetaGenerada.isDirectory()) { 
	        for (File f : carpetaGenerada.listFiles()) { 
	        	borrarCarpeta(f);  } 
	    } 
	    carpetaGenerada.delete(); 
	}
}
