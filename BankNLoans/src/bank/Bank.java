package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {
	/* VARIABLES */
	private String bankName;
	private List<Customer> customers = new ArrayList<Customer>();
	private List<Creditable> bankLoansApplications = new ArrayList<Creditable>();

	/* CONSTRUCTORS */
	public Bank(String bankName) {
		super();
		this.setBankName(bankName);
	}

	/* METHODS */
	public void addBankLoansApplications(Creditable bankLoansApplication) {
		this.bankLoansApplications.add(bankLoansApplication);
	}

	public void addCustomer(Customer customer) {
		this.customers.add(customer);
	}

	public int getTotalAmountToBeDisbursed() {
		List<Creditable> aceptableLoans = this.getBankLoansApplications().stream().filter(loan -> loan.isAceptable())
				.collect(Collectors.toList());
		double totalAmount = aceptableLoans.stream().mapToDouble(Creditable::getAmount).sum();

		return (int) totalAmount;
	}

	/* GETTERS & SETTERS */
	public String getBankName() {
		return bankName;
	}

	private void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Creditable> getBankLoansApplications() {
		return bankLoansApplications;
	}
}
