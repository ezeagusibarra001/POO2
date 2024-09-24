package bank;

abstract class CreditApplication implements Creditable {
	/* VARIABLES */
	private Customer customer;
	private int amount;
	private int termInMonths;

	/* CONSTRUCTORS */
	public CreditApplication(Customer customer, int amount, int termInMonths) {
		super();
		this.setCustomer(customer);
		this.setAmount(amount);
		this.setTermInMonths(termInMonths);
	}

	/* METHODS */
	public int getMonthlyFee() {
		return this.getAmount() / this.getTermInMonths();
	}

	/* GETTERS & SETTERS */
	public Customer getCustomer() {
		return customer;
	}

	private void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getAmount() {
		return amount;
	}

	private void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTermInMonths() {
		return termInMonths;
	}

	private void setTermInMonths(int termInMonths) {
		this.termInMonths = termInMonths;
	}
}
