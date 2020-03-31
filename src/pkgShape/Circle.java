package pkgShape;

public class Circle extends Shape implements Comparable<Circle> {
	
	private double Radius;

	//Creates an instance of Circle
	public Circle(double radius) {
		super();
		this.setRadius(radius);
	}
	
	//Finds the area of a circle
	public double area() {
		return Math.PI * Math.pow(this.getRadius(), 2);
	}
	
	//Retrieves the radius of the current instance of circle
	protected double getRadius() {
		return Radius;
	}
	
	//Sets the radius of the current instance of circle and checks if it is greater than zero
	protected void setRadius(double radius) throws IllegalArgumentException {
		try {
			if (radius > 0) {
				Radius = radius;
			}
			else {
				throw new IllegalArgumentException("The radius is not positive.");
			}
		} catch (IllegalArgumentException e) {
			System.out.print(e + "\n");
		}
	}
	
	//Compares two instances of circle together
	public int compareTo(Circle o) {
		if (this.area() > o.area()) {
			return 1;
		}
		else if (this.area() == o.area())  {
			return 0;
		}
		else {
			return -1;
		}
		
	}

}
