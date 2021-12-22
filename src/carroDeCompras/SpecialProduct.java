package carroDeCompras;

public class SpecialProduct extends Product {

	public SpecialProduct(float price, String name) {
		super(price, name);
	}
	
	@Override
	public float getPrice() {
		return this.getPrice() + (float) 4.25;
	}

}
