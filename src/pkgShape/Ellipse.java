package pkgShape;

public class Ellipse extends Circle {

	private double MinorRadius;

	//Creates an instance of Ellipse
	public Ellipse(double radius, double minorRadius) {
		super(radius);
		this.setMinorRadius(minorRadius);
	}
	
	//Finds the area of an Ellipse
	public double area() {
		return Math.PI * this.getRadius() * this.getMinorRadius();
	}
	
	//Retrieves the minorRadius of the current instance of Ellipse
	protected double getMinorRadius() {
		return MinorRadius;
	}
	
	//Sets the minorRadius of the current instance of Ellipse and checks if it is greater than zero
	protected void setMinorRadius(double minorRadius) throws IllegalArgumentException {
		try {
			if (minorRadius > 0) {
				MinorRadius = minorRadius;
			}
			else {
				throw new IllegalArgumentException("The minorRadius is not positive.");
			}
		} catch (IllegalArgumentException e) {
			System.out.print(e + "\n");
		}
	}
	
	//Checks if the current instance of Ellipse is a circle by equating its radii
	public boolean isCircle() {
		return this.getMinorRadius() == this.getRadius();
	}
	
	//Compares two instances of Ellipses together
	@Override
	public int compareTo(Circle o) {

		if (area() > o.area()) {
			return 1;
		}
		else if (area() == o.area())  {
			return 0;
		}
		else {
			return -1;
			
		}
	}

}
