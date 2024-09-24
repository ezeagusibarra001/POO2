package market;

public interface Purchasable {

	boolean canRegister(int quantity);

	void reduceStock(int quantity);

	int getPrice();
	
}
