package sistemaDeArchivos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;



public class Directorio extends SistemaDeArchivos{
	private String name;
	private Date fechaDeCreacion;
	private ArrayList<SistemaDeArchivos> contenido ;
	
	
	
	public Directorio(String name) {
		super();
		this.name = name;
		this.contenido = new ArrayList<SistemaDeArchivos>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<SistemaDeArchivos> getContenido() {
		return contenido;
	}

	public void agregarFyleSystem(SistemaDeArchivos fs) {
		fs.añadirOrden(this.getOrden());
		this.getContenido().add(fs);
	}
	
	public void eliminarFyleSystem( SistemaDeArchivos fyle ) {
		this.getContenido().remove(fyle);
	}

	@Override
	public int totalSize() {
		List <Integer> sizes = new ArrayList <Integer>();
		this.getContenido().stream().forEach(a -> sizes.add(a.totalSize()));
		return sizes.stream().reduce(0, (acumulado,nuevo)-> acumulado + nuevo);
		}
		
	@Override
	public void printStructure() {
		System.out.println( this.getName());
		for (SistemaDeArchivos fyle : this.getContenido()) {
			for(int i =0; i < fyle.getOrden() ; i++) {
				System.out.print(" ");
			}
			fyle.printStructure();
		}
		
	}
	@Override
	public SistemaDeArchivos lastModified() {
		return this.getContenido().stream().max(Comparator.comparing(SistemaDeArchivos :: getUltimaModificacion)).get();
	}
	@Override
	public SistemaDeArchivos oldestElement() {
		// TODO Auto-generated method stub
		return this;
	}
	
	public static void main(String[] args) {
		Directorio directorio = new Directorio("Carpeta");
		Archive archivo = new Archive("archivo", 120);
		Directorio directorio2 = new Directorio("Carpeta2");
		Archive archivo2 = new Archive("archivo2", 120);
		Archive archivo3 = new Archive ("archivo3" ,120);
		directorio.agregarFyleSystem(archivo);
		directorio.agregarFyleSystem(archivo2);
		directorio.agregarFyleSystem(directorio2);
		directorio2.agregarFyleSystem(archivo3);
		directorio.printStructure();
		
	}
	
}
