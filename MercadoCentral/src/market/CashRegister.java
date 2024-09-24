package market;
import java.util.ArrayList;
import java.util.List;

public class CashRegister {
	private List<Purchasable> products = new ArrayList<Purchasable>();
	private List<Purchasable> bag = new ArrayList<Purchasable>();
	private int totalPrice = 0;
	
	public void addProduct(Purchasable p) {
		List<Purchasable> newProducts = this.getProducts();
		newProducts.add(p);
		this.setProducts(newProducts);
	}
	
	public void registerPurchasable(Purchasable p, int quantity) {
		if(p.canRegister(quantity)) {
			p.reduceStock(quantity);
			this.bag.add(p);
			totalPrice += p.getPrice() * quantity;
		}
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
	
	/*GETTERS & SETTERS*/
	public List<Purchasable> getProducts() {
		return products;
	}

	private void setProducts(List<Purchasable> products) {
		this.products = products;
	}
}
