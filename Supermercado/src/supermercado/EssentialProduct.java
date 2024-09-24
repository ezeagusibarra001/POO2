package supermercado;

public class EssentialProduct extends Product {
	
	private double discount;

	public EssentialProduct(String name, double price, int discount) {
		super(name, price);
		this.setDiscount(discount);
	}

	public EssentialProduct(String name, double price, boolean isSubsidized, double discount) {
		super(name, price, isSubsidized);
		this.setDiscount(discount);
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() * this.getDiscount();
	}

	public double getDiscount() {
		return discount;
	}

	private void setDiscount(double discount) {
		this.discount = discount;
	}
}
