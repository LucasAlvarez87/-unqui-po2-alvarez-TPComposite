package sistemaDeArchivos;

import java.util.Date;

public abstract class FileSystem implements FyleSystem {
	
	private int orden;
	private Date ultimaModificacion;

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public FileSystem() {
		super();
		this.orden = 1;
		this.ultimaModificacion = new Date();
	}

	@Override
	public abstract int totalSize();
	
	@Override
	public abstract void printStructure();

	@Override
	public abstract FileSystem lastModified();

	@Override
	public abstract FileSystem oldestElement();

	public Date getUltimaModificacion() {
		return ultimaModificacion;
	}

	public void setUltimaModificacion(Date ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}

	protected void añadirOrden(int orden2) {
		this.setOrden(this.getOrden() + orden2);
	};

}
