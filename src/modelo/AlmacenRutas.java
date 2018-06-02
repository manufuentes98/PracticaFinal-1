package modelo;
import java.io.File;

public class AlmacenRutas<T> {

	// La ruta comun a todos los archivos
	private String pathComun = new String("./data/");
	private String directorio;

	// Directorio se refiere a la carpeta de un determinado grupo de valores
	public AlmacenRutas(String directorio) {
		super();
		this.directorio = directorio;
		pathComun = new String(pathComun+directorio);
		File file = new File(pathComun.toString());
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	public Object obtener(String claveElemento,String claveGrupo) {
		Object t;
		pathComun  = new String(pathComun+"/"+claveGrupo);
		String ruta=pathComun.toString();
		pathComun= new String(pathComun+"/"+claveElemento+".data");
		if(!new File(ruta).exists()){
			return null;
		}
			t=new DAO<>().leer(pathComun.toString());
		System.out.println(pathComun.toString());
		pathComun = new String("./data/"+directorio);
		return t;
	};

	public boolean grabar(T t,String claveElemento,String claveGrupo) {
		boolean retorno=false;
		pathComun  = new String(pathComun+"/"+claveGrupo);
		String ruta=pathComun.toString();
		pathComun= new String(pathComun+"/"+claveElemento+".data");
		if(!new File(ruta).exists()){
			new File(ruta).mkdirs();
		}
			retorno=new DAO<>().grabar(pathComun.toString(), t);
		System.out.println(pathComun.toString());
		pathComun = new String("./data/"+directorio);
		return retorno;
	}

}
