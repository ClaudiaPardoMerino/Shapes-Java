
public class Square extends DDShape {
	
	public double side;
	
	public Square(double s) {
		this.side = s;
	}
	
	public Square() {
		this.side = 0.0;
	}
	
@Override
public double getArea() {
	return area = side*side;
}

@Override
public String toString() {
	return "Square";
}

}
	


