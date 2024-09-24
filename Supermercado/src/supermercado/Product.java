package supermercado;

public class Product {

	private String name;
	private double price;
	private boolean isSubsidized;

	public Product(String name, double price, boolean isSubsidized) {
		this.setName(name);
		this.setPrice(price);
		this.setSubsidized(isSubsidized);
	}

	public Product(String name, double price) {
		this.setName(name);
		this.setPrice(price);
		this.setSubsidized(false);
	}

	public void upgradePrice(double priceToAdd) {
		this.setPrice(this.getPrice() + priceToAdd);
	}

	/* SETTERS AND GETTERS */

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		this.price = price;
	}

	public boolean isSubsidized() {
		return isSubsidized;
	}

	private void setSubsidized(boolean isSubsidized) {
		this.isSubsidized = isSubsidized;
	}

}
