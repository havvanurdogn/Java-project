public class Circle implements GeometricObject{ 

	private double radius; 

	public Circle(double radius) { 
		this.radius = radius; 
	} 
	
	public String toString() { 
		return "Circle [radius=" + radius + "]"; 
	} 
	
	public void getArea() {
		System.out.println("Area = " + (3.14 * radius * radius)); 
	} 
	
	public void getPerimeter() { 
		System.out.println("Perimeter = " + (2 * 3.14 * radius)); 
	} 
} 