package supermercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {

	private Product arroz;
	private Product vino;

	@BeforeEach
	public void setUp() {
		arroz = new Product("Arroz", 18.9d, true);
		vino = new Product("Vino", 55d);
	}

	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getName());
		assertEquals((double) 18.9, arroz.getPrice());
		assertTrue(arroz.isSubsidized());

		assertEquals("Vino", vino.getName());
		assertEquals((double) 55, vino.getPrice());
		assertFalse(vino.isSubsidized());
	}

	@Test
	public void testAumentarPrecio() {
		arroz.upgradePrice(1.5);
		assertEquals((double) 20.4, arroz.getPrice());
	}

}
