package bank;

public class MortgageCredit extends CreditApplication {
	/* VARIABLES */
	private RealEstateProperty property;
	public static final double MAXIMUM_MONTHLY_PAYMENT_PERCENTAGE_MORTGAGE = 0.50;
	public static final double MAXIMUM_LOAN_PERCENTAGE_MORTGAGE = 0.70;
	public static final int MAXIMUM_AGE_FOR_MORTGAGE = 65;

	/* CONSTRUCTORS */
	public MortgageCredit(Customer customer, int amount, int termInMonths, RealEstateProperty property) {
		super(customer, amount, termInMonths);
		this.setProperty(property);
	}

	/* METHODS */
	public boolean isAceptable() {
		return this.getMonthlyFee() < this.getCustomer().getMonthSalary()
				&& this.getAmount() < (this.getProperty().getValue() * MAXIMUM_LOAN_PERCENTAGE_MORTGAGE)
				&& this.getCustomer().getAge() <= MAXIMUM_AGE_FOR_MORTGAGE;
	}

	/* GETTERS & SETTERS */
	public RealEstateProperty getProperty() {
		return property;
	}

	public void setProperty(RealEstateProperty property) {
		this.property = property;
	}
}
