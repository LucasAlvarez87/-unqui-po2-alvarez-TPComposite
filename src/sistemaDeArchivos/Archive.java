package sistemaDeArchivos;

import java.util.Date;

public class Archive extends SistemaDeArchivos {
	private String name;
	private int peso;
	
	public Archive(String name, int peso) {
		super();
		this.name = name;
		this.peso = peso;
	}
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPeso() {
		return peso;
	}



	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void modificar(int nuevoPeso) {
		this.setPeso(nuevoPeso);
		this.setUltimaModificacion(getUltimaModificacion());
	}
	
	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return this.peso;
	}



	@Override
	public void printStructure() {
		System.out.println(this.getName());
		
	}



	@Override
	public Archive lastModified() {
		// TODO Auto-generated method stub
		return this;
	}



	@Override
	public SistemaDeArchivos oldestElement() {
		// TODO Auto-generated method stub
		return this;
	}



	
}
