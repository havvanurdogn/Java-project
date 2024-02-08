public abstract class Shape { 
	
	protected String color = "red"; 
	protected Boolean Filled = true; 

	public Shape() {
		
	} 

	public Shape(String color, Boolean filled) { 
		this.color = color; 
		Filled = filled; 
	}

	public String getColor() {
		return color; 
	}
	
	public void setColor(String color) { 
		this.color = color; 
	}
	
	public Boolean isFilled() { 
		return Filled; 
	} 
	
	public void setFilled(Boolean filled) { 
		Filled = filled; 
	} 
	
	abstract double getArea(); 
	abstract double getPerimeter(); 
	
	public String toString() { 
		return "Shape [color=" + color + ", filled=" + Filled + "]"; 
	}	 

} 