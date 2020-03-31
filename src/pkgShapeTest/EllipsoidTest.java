package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Circle;
import pkgShape.Ellipsoid;

class EllipsoidTest {

	@Test
	public void EllipsoidTest() {
		Ellipsoid elipso1 = new Ellipsoid(10.00,20.00,25.00);
		Ellipsoid elipso2 = new Ellipsoid(2.00,2.00,2.00);
		
		//Testing specifically for IllegalArgumentExceptions
		Ellipsoid elipso3 = new Ellipsoid(-1.00, 1.00, 1.00);
		Ellipsoid elipso4 = new Ellipsoid(1.00, 0.00, 1.00);
		Ellipsoid elipso5 = new Ellipsoid(1.00, 1.00, -1.00);
		Ellipsoid elipso6 = new Ellipsoid(-1.00, 0.00, -1.00);
		
		//Testing the methods in the Ellipsoid class
		assertEquals(20943.95, elipso1.Volume(), 0.01);
		assertEquals(33.51, elipso2.Volume(), 0.01);
		assertEquals(-1, elipso2.compareTo(elipso1));
	}

}
