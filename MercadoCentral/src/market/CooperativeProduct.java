package market;

public class CooperativeProduct extends Product {

	public CooperativeProduct(String name, int price, int stock) {
		super(name, price, stock);
	}

	@Override
	public int getPrice() {
		return (int) (super.getPrice() * 0.9);
	}
	
}
