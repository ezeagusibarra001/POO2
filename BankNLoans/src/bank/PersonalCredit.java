package bank;

public class PersonalCredit extends CreditApplication {
	public static final int MINIMUM_ANNUAL_INCOME_FOR_PERSONAL_LOAN = 15000;
	public static final double MAXIMUM_MONTHLY_PAYMENT_PERCENTAGE_PERSONAL = 0.70;

	public PersonalCredit(Customer customer, int amount, int termInMonths) {
		super(customer, amount, termInMonths);
	}

	public boolean isAceptable() {
		return this.getCustomer().getAnnualSalary() >= MINIMUM_ANNUAL_INCOME_FOR_PERSONAL_LOAN && this
				.getMonthlyFee() < (this.getCustomer().getMonthSalary() * MAXIMUM_MONTHLY_PAYMENT_PERCENTAGE_PERSONAL);
	}

}
