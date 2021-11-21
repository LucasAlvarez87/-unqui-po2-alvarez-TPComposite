package juegoDeEstatregia;

public class Point {
	
	private int x;
	private int y;
	private boolean estaMarcado;
	
	
	public Point(int x, int y) {
		super();
		this.estaMarcado = false;
		this.setXY(x,y);
	}
	
	public Point() {
		super();
		this.setXY(0,0);
	}

	public void setXY(int x,int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void moverPuntoX(int x) {
		this.setX(x);
	}
	
	public void moverPuntoY(int x) {
		this.setY(y);
	}

	public void marcar() {
		// TODO Auto-generated method stub
		this.estaMarcado = true;
	}
	
	public boolean estaMarcado() {
		return this.estaMarcado;
	}

	
}
