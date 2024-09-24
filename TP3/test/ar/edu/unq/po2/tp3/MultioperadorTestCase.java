package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {

	private Multioperador operador;
	
	@BeforeEach
	public void setUp() throws Exception {
		ArrayList<Integer> ns = new ArrayList<Integer>(Arrays.asList(10, -10, 5, 5));
		operador = new Multioperador(ns);
	}
	
	@Test
	void testAddAll() {
		assertEquals(10, operador.addAll());
	}
	
	@Test
	void testSubtractAll() {
		assertEquals(-10, operador.subtractAll());
	}
	
	@Test
	void testMultiplyAll() {
		assertEquals(-2500, operador.multiplyAll());
	}

}
