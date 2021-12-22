package carroDeCompras;

import java.util.List;

public class CarroDeCompras {
	List <Product> productos;

	public CarroDeCompras(List<Product> productos) {
		super();
		this.setElements(productos);
	}

	private void setElements( List<Product> productos) {
		this.productos = productos;
	}
	
	public int totalRounded() {
		int resultado = this.productos.stream().mapToInt(p->(int) p.getPrice()).reduce(0,(acumulado,nuevo) -> acumulado + nuevo);
		return resultado;
	}
	
	public float total() {
		double resultado = this.productos.stream().mapToDouble(p-> p.getPrice()).reduce(0, (acumulado,nuevo) -> acumulado + nuevo);
		return (float) resultado;
	}
	
	
}
