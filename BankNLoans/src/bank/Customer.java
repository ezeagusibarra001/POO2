package bank;

public class Customer {
	/*VARIABLES*/
	private String name;
	private String lastName;
	private String address;
	private int age;
	private int monthSalary;
	
	/*CONSTRUCTORS*/
	public Customer(String name, String lastName, String address, int age, int monthSalary) {
		super();
		this.setName(name);
		this.setLastName(lastName);
		this.setAddress(address);
		this.setAge(age);
		this.setMonthSalary(monthSalary);
	}
	
	/*METHODS*/	
	public int getAnnualSalary() {
		return this.getMonthSalary() * 12;
	}
	
	/* GETTERS & SETTERS */
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	public int getMonthSalary() {
		return monthSalary;
	}
	private void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	
	
}
