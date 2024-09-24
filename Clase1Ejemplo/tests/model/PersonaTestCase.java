package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {

	private Persona eze;

	@BeforeEach
	void setUp() throws Exception {
		this.eze = new Persona("Eze");
	}

	@Test
	void testConstructor() {
		assertEquals("Eze", this.eze.getNombre());
		assertEquals(0, this.eze.getCantidadDePerros());
	}
	
	@Test
	void testCantidadDePerros() {
		this.eze.sumarPerros(3);
		assertEquals(3, this.eze.getCantidadDePerros());
	}

}
