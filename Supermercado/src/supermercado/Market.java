package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Market {
	private List<Product> catalog = new ArrayList<Product>();
	private String name;
	private String address;
	
	
	public Market(String name, String address) {
		this.setName(name);
		this.setAddress(address);
	}
	
	public Integer getQtyOfProducts() {
		return this.getCatalog().size();
	}

	public void addProduct(Product product) {
		List<Product> newCatalog = this.getCatalog();
		newCatalog.add(product);
		this.setCatalog(newCatalog);
	}

	public Double getTotalPrice() {
		Double pricesCount = (double) 0;
		
		for (Product product : catalog) {
			pricesCount += product.getPrice();
		}
		
		return pricesCount;
	}
	
	/* SETTERS AND GETTERS */

	public String getName() {
		return name;
	}


	private void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}
	
	private List<Product> getCatalog() {
		return catalog;
	}

	private void setCatalog(List<Product> catalog) {
		this.catalog = catalog;
	}

}
