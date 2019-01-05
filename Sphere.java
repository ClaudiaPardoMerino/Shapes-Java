
public class Sphere extends DDDShape {
	public double radius;
	
	public Sphere(double r) {
		this.radius = r;
	}
	
	public Sphere() {
		this.radius = 0.0;
	}
	
	@Override
	public double getVolume() {
		return volume = (4/3)*(3.14159)*radius*radius*radius;
	}
	
	@Override
	public double getArea() {
		return area = 4*(3.14159)*radius*radius;
	}
	
	@Override
	public String toString() {
		return "Sphere";
	}

}
