public class Main { 

	public static void main(String[] args) { 

		Circle circle1 = new Circle(5); 
		Circle circle2 = new Circle(); 
		Circle circle3 = new Circle(8, "blue", false); 
		Rectangle r1 = new Rectangle(12, 6); 
		Square s1 = new Square(6); 
		
		System.out.println(circle1.toString()); 
		System.out.println(circle2.toString()); 
		System.out.println(r1.toString()); 
		System.out.println(s1.toString()); 
		System.out.println(circle3.toString()); 
	} 
}