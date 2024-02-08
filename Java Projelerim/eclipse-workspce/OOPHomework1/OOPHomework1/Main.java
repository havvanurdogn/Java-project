package OOPHomework1;

public class Main {

	public static void main(String [] args) {
		
		Shape shape1 = new Shape();
		Shape shape2 = new Shape(null, false);
		
		shape1.setColor("yellow");
		shape1.setFilled(true);
		
		System.out.println(shape1.getColor());
		System.out.println(shape1.isFilled());
		System.out.println(shape1.toString());
		System.out.println("*****************************");
		
		shape2.setColor("pink");
		shape2.setFilled(false);
		
		System.out.println(shape2.getColor());
		System.out.println(shape2.isFilled());
		System.out.println(shape2.toString());
		System.out.println("*****************************");
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(0);
		Circle circle3 = new Circle(null, false, 0);
		
		System.out.println(circle1.getRadius());
		System.out.println(circle1.toString());
		System.out.println("*****************************");
		
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(0, 0);
		Rectangle rectangle3 = new Rectangle(null, false, 0, 0);
		
		System.out.println(rectangle1.toString());
		System.out.println("*****************************");
		
		Square square1 = new Square();
		Square square2 = new Square(0);
		Square square3 = new Square(null, false, 3);
		
		square3.setColor("blue");
		
		System.out.println(square3.getColor());
		System.out.println(square3.toString()); //square toStringte sıkıntı var.(length ve width kısmına side yazmak istiyorum.)
		
		
		
		
	}
	
}
