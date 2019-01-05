
public class Tetrahedron extends DDDShape {
	
	public double edgelength;
	
	public Tetrahedron(double a) {
		this.edgelength = a;
	}
	
	public Tetrahedron() {
		this.edgelength = 0.0;
	}
	
	
	@Override
	public double getArea() {
		return area = Math.pow(3.0,0.5)* Math.pow(edgelength,2.0);
		
	}
	
	@Override
	public double getVolume() {
		return volume = (0.333333)*getArea()*Math.pow(0.666666,0.5)*edgelength;
	}

	@Override
	public String toString() {
		return "Tetrahedron";
	}
}
