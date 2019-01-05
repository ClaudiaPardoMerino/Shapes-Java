
public class Triangle extends DDShape {
	
	public double base;
	public double height;
	
	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}
	
	public Triangle() {
		this.base = 0.0;
		this.height = 0.0;	
	
	}
@Override
public double getArea() {
	return area = 0.5 *base*height;
}

@Override
public String toString() {
	return "Triangle";
}

}
