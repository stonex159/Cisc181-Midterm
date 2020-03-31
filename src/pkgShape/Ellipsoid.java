package pkgShape;

public class Ellipsoid extends Ellipse {

	private double HeightRadius;

	//Creates an instance of Ellipsoid
	public Ellipsoid(double radius, double minorRadius, double heightRadius) {
		super(radius, minorRadius);
		this.setHeightRadius(heightRadius);
	}
	
	//Finds the volume of the current instance of Ellipse
	public double Volume() {
		return (4.0/3.0) * Math.PI * this.getRadius() * this.getMinorRadius() * this.getHeightRadius();
	}
	
	//Retrieves the heightRadius of the current Ellipsoid
	protected double getHeightRadius() {
		return HeightRadius;
	}
	
	//Sets the heightRadius of the current Ellipsoid and checks if it is greater than zero
	protected void setHeightRadius(double heightRadius) throws IllegalArgumentException {
		try {
			if (heightRadius > 0) {
				HeightRadius = heightRadius;
			}
			else {
				throw new IllegalArgumentException("The heightRadius is not positive.");
			}
		} catch (IllegalArgumentException e) {
			System.out.print(e + "\n");
		}
	}
	
	//Compares two instances of Ellipsoids together
	@Override
	public int compareTo(Circle o) {
			if (this.Volume() > ((Ellipsoid)o).Volume()) {
				return 1;
			}
			else if (this.Volume() == ((Ellipsoid)o).Volume())  {
				return 0;
			}
			else {
				return -1;
			}
	}
	
}
