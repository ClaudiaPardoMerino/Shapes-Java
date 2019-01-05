
public class DDShape extends Shape {

	private double x;
	private double y;
	public double area;
	
	public DDShape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public DDShape() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public double getArea() {
		return area;
	}
	
}
