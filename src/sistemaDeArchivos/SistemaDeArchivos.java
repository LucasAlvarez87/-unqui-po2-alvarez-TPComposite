package sistemaDeArchivos;

import java.util.Date;

public abstract class SistemaDeArchivos implements FyleSystem {
	
	private int orden;
	private Date ultimaModificacion;

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public SistemaDeArchivos() {
		super();
		this.orden = 1;
		this.ultimaModificacion = new Date();
	}

	@Override
	public abstract int totalSize();
	
	@Override
	public abstract void printStructure();

	@Override
	public abstract SistemaDeArchivos lastModified();

	@Override
	public abstract SistemaDeArchivos oldestElement();

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
