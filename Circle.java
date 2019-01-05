
public class Circle extends DDShape {
	
	public double radius;
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public Circle() {
		this.radius = 0.0;
	}
	
@Override
public double getArea() {
	return area = 3.14159*radius*radius;
}
	
@Override
public String toString() {
	return "Circle";
}

}
