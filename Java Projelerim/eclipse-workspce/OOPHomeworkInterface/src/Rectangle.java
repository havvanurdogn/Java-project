public class Rectangle implements GeometricObject{ 

	private double width;
	private double length; 

	public Rectangle(double width, double length) { 
		this.width = width; 
		this.length = length; 
	} 
	
	public String toString() { 
		return "Rectangle [width=" + width + ", length=" + length + "]"; 
	} 
	
	public void getArea() { 
		System.out.println("Area: " + (length * width)); 
	}  

	public void getPerimeter() { 
		System.out.println("Perimeter: " + 2 * (length+width)); 
	}
}	
