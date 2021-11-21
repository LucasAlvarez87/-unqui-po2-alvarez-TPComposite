package juegoDeEstatregia;

public class Ingeniero {
	
	Point ubicacion;
	Mapa mapa;

	public Ingeniero(Point ubicacion, Mapa mapa) {
		super();
		this.mapa = mapa;
		this.ubicacion = ubicacion;
	}
	
	public void moverA(Point destino) {
		this.getMapa().moverIngenieroDe_A(this.getUbicacion(),destino);
		this.setUbicacion(destino);
	}

	public void setUbicacion(Point ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Point getUbicacion() {
		return ubicacion;
	}

	public Mapa getMapa() {
		return mapa;
	}
	
}
