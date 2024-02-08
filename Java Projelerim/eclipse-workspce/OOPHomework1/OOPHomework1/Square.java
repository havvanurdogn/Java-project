package OOPHomework1;

public class Square extends Rectangle  {

	private double side;
	
	public Square() {
		
	}
	
	public Square(double side) {
		this.side = side;
	}

	public Square(String color , boolean filled , double side) {
		super(color,filled);
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	public void setWidth(double side) {
		this.side = side;
	}
	
	public void setLength(double side) {
		this.side = side;
	}
	
	public double getArea() {
		return side * side ;
	}
	
	public String toString() {
		return "Color : " + getColor() + " Filled : " + isFilled() + " Side : " + side;
	}
	
	
	
}
