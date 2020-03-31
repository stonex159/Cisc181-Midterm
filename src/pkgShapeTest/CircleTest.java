package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Circle;

class CircleTest {
	
	

	@Test
	public void CircleTest() {
		Circle c1 = new Circle(10.00);		
		Circle c2 = new Circle(4.00);
		
		//Testing specifically for IllegalArgumentExceptions
		Circle c3 = new Circle(-1.00);
		Circle c4 = new Circle(0.00);

		//Testing the methods in the Circle class
		assertEquals(314.15, c1.area(), 0.01);
		assertEquals(50.27, c2.area(), 0.01);
		assertEquals(1, c1.compareTo(c2));
	}
}
