
public class DDDShape extends Shape {
	private double x;
	private double y;
	private double z;
	public double area;
	public double volume;
	
	public DDDShape(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public DDDShape() {
		this.x = 0.0;
		this.y = 0.0;
		this.z = 0.0;
	}
	
	public double getArea() {
		return area;
	}
	
	public double getVolume() {
		return volume;
	}

}
