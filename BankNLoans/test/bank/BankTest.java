package bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class BankTest extends TestCase {
	Bank bank = new Bank("BBVA");
	
	Customer c1 = new Customer("Juan", "Perez", "Calle 123", 24, 120000);
	Customer c2 = new Customer("Carlos", "Sanchez", "Calle 546", 40, 40000);
	
	RealEstateProperty home = new RealEstateProperty("Casa", "Calle 564", 120000000);
	
	Creditable personalCredit = new PersonalCredit(c1, 20000, 6);
	Creditable mortgageCredit = new MortgageCredit(c2, 120000, 60, home);
	
	
	@BeforeAll
	protected void setUp() {
		this.bank.addCustomer(c1);
		this.bank.addCustomer(c2);
		this.bank.addBankLoansApplications(personalCredit);
		this.bank.addBankLoansApplications(mortgageCredit);
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(this.bank.getTotalAmountToBeDisbursed(), 140000);
	}

}
