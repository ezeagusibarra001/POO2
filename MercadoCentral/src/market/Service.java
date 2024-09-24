package market;

public class Service extends Factura implements Purchasable {
	private int costo;
	private int qty;
	private Agencia agencia;
	
	public Service(int costo, int qty) {
		super();
		this.setCosto(costo);
		this.setQty(qty);
	}

	public boolean canRegister(int quantity) {
		return true;
	}

	public void reduceStock(int quantity) {
		agencia.registrarPago(this);
	}

	public int getPrice() {
		return this.getCosto() * this.getQty();
	}

	public int getCosto() {
		return costo;
	}

	private void setCosto(int costo) {
		this.costo = costo;
	}

	public int getQty() {
		return qty;
	}

	private void setQty(int qty) {
		this.qty = qty;
	}

}
