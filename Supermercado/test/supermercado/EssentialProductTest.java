package supermercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EssentialProductTest {

	private EssentialProduct leche;
	private EssentialProduct arroz;

	@BeforeEach
	public void setUp() {
		leche = new EssentialProduct("Leche", 8d, false, 0.9);
		arroz = new EssentialProduct("Arroz", 10d, false, 0.5);
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals((double) 7.2, leche.getPrice());
	}
	
	@Test
	public void testSettingDiscount() {
		assertEquals((double) 5, arroz.getPrice());
	}
}
