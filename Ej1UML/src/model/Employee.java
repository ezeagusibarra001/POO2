package model;

import java.util.Calendar;
import java.util.Date;

public class Employee {
	private String name;
	private String address;
	private String maritalStatus;
	private Date birthday;
	private int salary;
	
	public Employee(String name, String address, String maritalStatus, Date birthday, int salary) {
		this.setName(name);
		this.setAddress(address);
		this.setMaritalStatus(maritalStatus);
		this.birthday = birthday;
		this.setSalary(salary);		
	}
	
	public int getAge() {
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthday);
        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        return age;
    }

	
	public int getSalary() {
		return salary;
	}
	
	private void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getWithholdings() {
		return 0;
	}

	public int getNetSalary() {
		return 0;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
