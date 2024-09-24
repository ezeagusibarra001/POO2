package model;

import java.util.List;

public class Company {
	private List<Employee> employees;
	private String name;
	private String cuit;
	
	public Company(String name, String cuit) {
		this.setName(name);
		this.setCuit(cuit);
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public int getNetSalary() {
		return 0;
	}
	
	public int getAllSalaryExpenses() {
		return 0;
	}
	
	public int getAllWithholdings() {
		return 0;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getCuit() {
		return cuit;
	}

	private void setCuit(String cuit) {
		this.cuit = cuit;
	}
}
