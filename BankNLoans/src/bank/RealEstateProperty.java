package bank;

public class RealEstateProperty {
	/*VARIABLES*/
	private String description;
	private String address;
	private int value;
	
	/*CONSTRUCTORS*/
	public RealEstateProperty(String description, String address, int value) {
		super();
		this.setDescription(description);
		this.setAddress(address);
		this.setValue(value);
	}

	/* GETTERS & SETTERS */
	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	public int getValue() {
		return value;
	}

	private void setValue(int value) {
		this.value = value;
	}
	
	
}
