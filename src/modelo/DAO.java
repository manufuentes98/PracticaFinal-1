
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

//Data Access Object

public class DAO<T>  {
	class MyObjectOutputStream extends ObjectOutputStream {

		public MyObjectOutputStream(OutputStream out) throws IOException {
			super(out);
		}

		@Override
		protected void writeStreamHeader() throws IOException {
		}
	}

	public Object leer(String path) {
		return leer(path, 0);
	}

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
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		cerrar(flujoR);
		return obj;
	}

	public boolean grabar(String path, Object t) {
		return grabar(path, t, false);
	}

	public boolean grabar(String path, Object t, boolean adicion) {
		
		boolean retorno = true;
		boolean existe = new File(path).exists() && adicion;
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
			if(!new File(path.substring(0,path.lastIndexOf('/'))).exists())
				new File(path.substring(0,path.lastIndexOf('/'))).mkdirs();
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
}
