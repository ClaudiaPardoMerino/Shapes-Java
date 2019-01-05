
public class TestShapes {
	
	public static void main(String[] args )
	   {
	Shape[] ShapeArray = new Shape[6];
	Circle Circ = new Circle(2.0);
	Square Sqr = new Square(4.0);
	Triangle Tri = new Triangle(4.0, 2.0);
	Sphere Sph = new Sphere(3.0);
	Cube Cub = new Cube(5.0);
	Tetrahedron Teta = new Tetrahedron(6.0);
	
	
	ShapeArray[0] = Circ;
	ShapeArray[1] = Sph;
	ShapeArray[2] = Sqr;
	ShapeArray[3] = Tri;
	ShapeArray[4] = Cub;
	ShapeArray[5] = Teta;
	
	for (Shape CurrentShape : ShapeArray) {
		if (CurrentShape instanceof DDShape) {
			DDShape shp = (DDShape) CurrentShape;
			System.out.printf("%s\n", CurrentShape.toString());
			System.out.printf("2D Shape\n");
			System.out.printf("Area: %f\n\n", shp.getArea());
	}
		else {
			DDDShape ssshp = (DDDShape) CurrentShape;
			System.out.printf("%s\n", CurrentShape.toString());
			System.out.printf("3D Shape\n");
			System.out.printf("Area: %f\n", ssshp.getArea());
			System.out.printf("Volume: %f\n\n", ssshp.getVolume());
		}

}
}
}
	
