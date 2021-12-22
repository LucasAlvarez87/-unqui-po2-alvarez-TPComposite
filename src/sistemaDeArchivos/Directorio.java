package sistemaDeArchivos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;



public class Directorio extends FileSystem{
	private String name;
	private Date fechaDeCreacion;
	private ArrayList<FileSystem> contenido ;
	
	
	
	public Directorio(String name) {
		super();
		this.name = name;
		this.contenido = new ArrayList<FileSystem>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<FileSystem> getContenido() {
		return contenido;
	}

	public void agregarFileSystem(FileSystem file) {
		file.añadirOrden(this.getOrden());
		this.getContenido().add(file);
	}
	
	public void eliminarFyleSystem( FileSystem file ) {
		this.getContenido().remove(file);
	}

	@Override
	public int totalSize() {
		/*List <Integer> sizes = new ArrayList <Integer>();
		this.getContenido().stream().forEach(a -> sizes.add(a.totalSize()));
		return sizes.stream().reduce(0, (acumulado,nuevo)-> acumulado + nuevo);
		*/
		int totalSize = 0;
		for (FileSystem file : this.getContenido() ) {
			totalSize += file.totalSize();
		}
		return totalSize;
	}
		
	@Override
	public void printStructure() {
		System.out.println( this.getName());
		for (FileSystem fyle : this.getContenido()) {
			for(int i =0; i < fyle.getOrden() ; i++) {
				System.out.print(" ");
			}
			fyle.printStructure();
		}
		
	}
	@Override
	public FileSystem lastModified() {
		FileSystem ultimoModificado =  this.getContenido().stream().max(Comparator.comparing(FileSystem :: getUltimaModificacion)).get();
		return ultimoModificado ;
		
	}
	@Override
	public FileSystem oldestElement() {
		// TODO Auto-generated method stub
		return this.getContenido().stream().min(Comparator.comparing(FileSystem :: getUltimaModificacion)).get();
	}
	
	public static void main(String[] args) {
		Directorio directorio = new Directorio("Carpeta");
		Archive archivo = new Archive("archivo", 120);
		Directorio directorio2 = new Directorio("Carpeta2");
		Archive archivo2 = new Archive("archivo2", 130);
		Archive archivo3 = new Archive ("archivo3" ,140);
		directorio.agregarFileSystem(archivo);
		directorio.agregarFileSystem(archivo2);
		directorio.agregarFileSystem(directorio2);
		directorio2.agregarFileSystem(archivo3);
		System.out.print(directorio.lastModified().totalSize());
		
	}
	
}
