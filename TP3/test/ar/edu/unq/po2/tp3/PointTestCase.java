package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	
	private Point p1;
	private Point p2;
	
	@BeforeEach
	void setUp() throws Exception {
		p1 = new Point();
		p2 = new Point(4, 6);
	}

	@Test
	void testSumPoints() {
		Point newP = new Point();
		assertEquals(newP.getX(), p1.getX());
		assertEquals(newP.getY(), p1.getY());
		
		newP.movePoint(2, 5);
		newP.sumToOtherPoint(p2);
		
		assertEquals(newP.getX(), 6);
		assertEquals(newP.getY(), 11);
		
	}

}
