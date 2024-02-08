public class Square extends Rectangle{ 

	protected double side = 1.0; 

	public Square() { 

	} 

	public Square(double side) { 
		this.side = side; 
	}

	public Square(double side, String color, Boolean filled) { 
		super(); 
		this.side = side; 
	} 

	public double getSide() { 
		return side; 
	} 

	public void setSide(double side) { 
		this.side = side; 
	}

	public void setWidth(double width) { 
		super.setWidth(width); 
	} 
	
	public void setLength(double length) { 
		super.setLength(length); 
	} 
	
	public String toString() { 
		return "Square [" + super.toString() + "]"; 
	} 
} 