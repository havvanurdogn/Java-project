public class Circle extends Shape{ 

	protected double radius = 1.0; 
	
	public Circle() {

	} 
	 
	public Circle(double radius) { 
		this.radius = radius; 
	}
	 
	public Circle(double radius,String color, Boolean filled) { 
		super(color, filled); 
		this.radius = radius;	 
	} 

	public double getRadius() {
		return radius; 
	} 

	public void setRadius(double radius) { 
		this.radius = radius; 
	} 

	double getArea() { 
		return (3.14 * radius * radius); 
	} 
	
	double getPerimeter() { 
		return (2 * 3.14 * radius); 
	} 

	public String toString() { 
		return "Circle [" + super.toString() + ",radius=" + radius + "]"; 
	} 
}