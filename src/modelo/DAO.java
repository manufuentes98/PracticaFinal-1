
package modelo;


import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.TreeMap;
import java.util.Map.Entry;

//Data Access Object

public class DAO<T, K>  {
	private String pathIndice;
	private String pathDatos;
	private TreeMap<K, Integer> indice;
	private String pathComun = new String("data/");
	private String directorio;
	
	
	public DAO() {
		super();
		this.indice = new TreeMap<>();
	}

	class MyObjectOutputStream extends ObjectOutputStream {

		public MyObjectOutputStream(OutputStream out) throws IOException {
			super(out);
		}

		@Override
		protected void writeStreamHeader() throws IOException {
		}
	}

	private boolean validate() {
		return this.pathIndice != null && this.pathDatos != null;
	}

	private boolean cerrar(Closeable input) {
		boolean retorno = true;
		try {
			input.close();
		} catch (IOException e) {
			retorno = false;
		}
		return retorno;
	}

	private FileOutputStream abrir(String path, boolean adicion) {
		FileOutputStream flujoW = null;
		File file = new File(path);
		try {
			flujoW = new FileOutputStream(file, adicion);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return flujoW;
	}

	private FileOutputStream abrir(String path) {
		return abrir(path, false);
	}

	private FileInputStream abrirFlujoLectura(String path) {
		File file = new File(path);
		FileInputStream flujoR = null;
		if (file.exists()) {
			try {
				flujoR = new FileInputStream(file);
			} catch (FileNotFoundException e) {
			}
		}
		return flujoR;
	}
	public boolean grabar(String path, Object t) {
		return grabar(path, t, false);
	}
	public boolean grabar(String path, Object t, boolean adicion) {
		File file = new File(path);
		boolean retorno = true;
		boolean existe = file.exists() && adicion;
		FileOutputStream flujoW = abrir(path, adicion);
		try {
			ObjectOutputStream adaptadorW = null;
			if (!existe) {
				adaptadorW = new ObjectOutputStream(flujoW);
			} else {
				adaptadorW = new MyObjectOutputStream(flujoW);
			}
			adaptadorW.writeObject(t);
		} catch (IOException e) {
			e.printStackTrace();
			retorno = false;
		}
		cerrar(flujoW);
		return retorno;
	}
	
	public boolean grabar(T t, K k) {
		assert k != null && t != null;
		this.pathIndice = String.valueOf(t.getClass().getName());
		this.pathDatos = String.valueOf(k);
		boolean retorno = false;
		// miro el ultimo indice. siempre hay un mapa aqui
		Entry<K, Integer> lastEntry = indice.lastEntry();
		Integer value = 0;
		// si es el primer elemento lastentry sera null
		if (lastEntry != null) {
			value = lastEntry.getValue() + 1;
		}
		if (indice.put(k, value) == null) {
			if (grabar(pathDatos, t, true)) {
				retorno = true;
				grabar(pathIndice, indice);
			}else{
				//Si no se graba bien actualizamos el indice con la version grabada
				indice = (TreeMap<K, Integer>) leer(pathIndice);
			}
		}
		return retorno;
	}
	public boolean grabar(T t,String claveGrupo,String claveElemento) {
		boolean retorno=false;
		pathComun = new String("data/"+claveGrupo);
		if(!new File(pathComun).exists()){
			new File(pathComun).mkdirs();
		}
		pathComun= new String(pathComun+"/"+claveElemento+".data");
		retorno=grabar(pathComun, t);
		System.out.println(pathComun.toString());
		return retorno;
	}
	
	public T leer(K k) {
		assert k != null;
		indice = (TreeMap<K, Integer>) new DAO().leer(pathIndice);
		if (indice == null) {
			indice = new TreeMap<>();
			grabar(pathIndice, indice);
		}
		T retorno = null;
		Integer posicion = indice.get(k);
		if (posicion != null) {
			retorno = (T) leer(pathDatos, posicion);
		}
		return retorno;
	}
	
	public Object leer(String path) {
		return leer(path, 0);
	}
	
	public Object leer(String claveElemento,String claveGrupo) {
		Object t;
		pathComun = new String("data/"+claveGrupo);
		pathComun= new String(pathComun+"/"+claveElemento+".data");
		if(!new File(pathComun).exists()){
			return null;
		}
		t=leer(String.valueOf(pathComun));
		return t;
	};
	
	public Object leer(String path, int posicion) {
		FileInputStream flujoR = abrirFlujoLectura(path);
		ObjectInputStream adaptadorR = null;
		Object obj = null;
		try {
			if (flujoR != null) {
				adaptadorR = new ObjectInputStream(flujoR);
				for (int i = 0; i < posicion; i++) {
					obj = adaptadorR.readObject();
				}
				obj = adaptadorR.readObject();
				cerrar(flujoR);
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("fin de lectura");
		}
		return obj;
	}
}
