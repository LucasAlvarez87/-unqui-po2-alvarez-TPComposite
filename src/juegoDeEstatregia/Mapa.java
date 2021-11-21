package juegoDeEstatregia;

public class Mapa {
	
	private Point matriz [] [] = { {new Point(0,0),new Point(0,1),new Point(0,2),new Point(0,3),new Point(0,4)}, 
			{new Point(1,0),new Point(1,1),new Point(1,2),new Point(1,3),new Point(1,4)} ,
			{new Point(2,0),new Point(2,1),new Point(2,2),new Point(2,3),new Point(2,4)}  ,
			{new Point(3,0),new Point(3,1),new Point(3,2),new Point(3,3),new Point(3,4)} ,
			{new Point(4,0),new Point(4,1),new Point(4,2),new Point(4,3),new Point(4,4)} };

	public Mapa() {
		super();
		
	}

	public Point[][] getMatriz() {
		return matriz;
	}

	public void moverIngenieroDe_A(Point ubicacion, Point destino) {
		int posicionX = ubicacion.getX();
		int posicionY = ubicacion.getY();
		this.getMatriz() [posicionX] [posicionY].marcar();
		if (posicionX < destino.getX()) {
			while (posicionX < destino.getX()) {
				posicionX ++;
				this.getMatriz() [posicionX] [posicionY].marcar();
			}
		}
		else {
			while (posicionX > destino.getX()) {
				posicionX --;
				this.getMatriz() [posicionX] [posicionY].marcar();
			}
		}
		if (posicionY < destino.getY()) {
			while (posicionY < destino.getY()) {
				posicionY ++;
				this.getMatriz() [posicionX] [posicionY].marcar();
			}
		}
		else {
			while (posicionY < destino.getY()) {
				posicionY --;
				this.getMatriz() [posicionX] [posicionY].marcar(); 
			}
		}
	}

}
	
	
	
