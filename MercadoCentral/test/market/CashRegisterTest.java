package market;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CashRegisterTest {
	
	CashRegister cashRegister = new CashRegister();
	Product arroz = new Product("Arroz", 4000, 8);
	Product harina = new Product("Harina", 1500, 2);
	Product coca = new Product("Coca-Cola", 2500, 10);
	Product agua = new Product("Agua", 1000, 5);

	@BeforeEach
	void setUp() throws Exception {
		cashRegister.addProduct(arroz);
		cashRegister.addProduct(harina);
		cashRegister.addProduct(coca);
		cashRegister.addProduct(agua);
	}

	@Test
	void testBuyAllRice() {
		cashRegister.registerPurchasable(arroz, 8);
		assertEquals(0, arroz.getStock());
		assertEquals(cashRegister.getTotalPrice(), 32000);
	}
	
	@Test
	void testBuyAFew() {
		cashRegister.registerPurchasable(arroz, 4);
		cashRegister.registerPurchasable(harina, 2);
		cashRegister.registerPurchasable(coca, 10);
		assertEquals(4, arroz.getStock());
		assertEquals(0, harina.getStock());
		assertEquals(0, coca.getStock());
		assertEquals(cashRegister.getTotalPrice(), 44000);
	}

}
