public class Main { 

	public static void main(String[] args) { 

		Circle circle = new Circle(2); 
		Rectangle rectangle = new Rectangle(8, 9); 
		
		circle.getArea(); 
		circle.getPerimeter(); 
		
		System.out.println(circle.toString()); 

		rectangle.getArea(); 
		rectangle.getPerimeter(); 

		System.out.println(rectangle.toString()); 
	} 
}