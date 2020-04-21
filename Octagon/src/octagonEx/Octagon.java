
package octagonEx;

public class Octagon implements shape {
	private double sidelength;
	
	public Octagon(double sidelength) {
		this.sidelength=sidelength;
		
	}
	public double getPerimter() {
		return 8 * sidelength;// formula Perimeter for Octagon shape 
	}
	
	public double getArea() {
		return 2*(1 + Math.sqrt(2))* (sidelength * sidelength);// formula to find area for octagon shape
	}
		
	}


