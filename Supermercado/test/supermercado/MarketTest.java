package supermercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MarketTest {

	private Product arroz;
	private Product detergente;
	private Market market;

	@BeforeEach
	public void setUp() {
		arroz = new Product("Arroz", 18.9d, true);
		detergente = new Product("Detergente", 75d);
		market = new Market("Lo de Tito", "Av Zubeldia 801");

	}

	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, market.getQtyOfProducts());
		market.addProduct(arroz);
		market.addProduct(detergente);
		assertEquals(2, market.getQtyOfProducts());
	}

	@Test
	public void testPrecioTotal() {
		assertEquals((double) 0, market.getTotalPrice());
		market.addProduct(arroz);
		market.addProduct(detergente);
		assertEquals((double) 93.9, market.getTotalPrice());
	}

}
