package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Circle;
import pkgShape.Ellipse;

class EllipseTest {

	@Test
	public void EllipseTest() {
		Ellipse elips1 = new Ellipse(10.00, 20.00);
		Ellipse elips2 = new Ellipse(10.00, 20.00);
		
		//Testing specifically for IllegalArgumentExceptions
		Ellipse elips3 = new Ellipse(-1.00, 1.00);
		Ellipse elips4 = new Ellipse(1.00, 0.00);
		Ellipse elips5 = new Ellipse(-1.00, 0.00);
		
		//Testing the methods in the Ellipse class
		assertEquals(628.32, elips1.area(), 0.01);
		assertEquals(628.32, elips2.area(), 0.01);
		assertEquals(0, elips1.compareTo(elips2));
		assertEquals(false, elips1.isCircle());
	}

}
