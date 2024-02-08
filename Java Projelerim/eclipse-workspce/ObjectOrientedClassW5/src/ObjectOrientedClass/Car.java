package ObjectOrientedClass;

public class Car {

	String name = "GM";
	String model = "GM";
	int year = 2000;
	
	static int numberObject = 0;
	
	final int doors = 4;
	
	public static void message() {
		
	}

	/*public Car(String name, String model, int year) {
		this.name = name;
		this.model = model;
		this.year = year;

	}
	// i can create another constructure but different signature
	
	public Car() {
		numberObject++;
		System.out.println("I'm being instantiated now ...");
	}
	
	public Car(String message) {
		numberObject++;
		System.out.println(message);
	}
	
	public Car(String message , int x) {
		numberObject++;
		System.out.println(message + x);
	}*/
	//This is constructure overloading.

}
