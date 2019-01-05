
public class Cube extends DDDShape {
	public double side;
	
	public Cube(double s) {
		this.side = s;
	}
	
	public Cube() {
		this.side = 0.0;
	}
	
	@Override
	public double getVolume() {
		return volume = side*side*side;
	}
	
	@Override
	public double getArea() {
		return area = 6*(side*side);
	}

	@Override
	public String toString() {
		return "Cube";
	}
}