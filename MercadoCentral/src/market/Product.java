package market;

public class Product implements Purchasable {
	private static int idCounter = 1;
	private int id;
	private String name;
	private int price;
	private int stock;
	
	public Product(String name, int price, int stock) {
		super();
		this.id = idCounter++;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public void reduceStock(int quantity) {
		this.stock -= quantity;
	}
	
	public boolean canRegister(int quantity) {
		return this.getStock() >= quantity;
	}

	
	// Getters para obtener los valores de los atributos
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

}
