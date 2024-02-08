package ObjectOrientedClass;

public class Main {

	public static void main(String[] args) {
		/*Car myCar1 = new Car(); // good question for exam Car(); => for constructure
		
		Car myCar2;
		myCar2 = new Car("I'm the second one ...");
		
		Car myCar3 = new Car("I am an object number : ", 3);
		
		System.out.println("Number of objects : " + myCar1.numberObject);
		System.out.println("Number of objects : " + Car.numberObject); */
		//numberObject static olduğu için object oluşturmadan ona erişebiliyoruz class adı kullanmamız önemli
		
		Car.message();//if method is not static we dont use like that 
		
		Person myPerson1 = new Person();
		myPerson1.setName("Einstain");
		myPerson1.setAge(50);        
		
		Person myPerson2 = new Person();
		myPerson2.setName("Jane");
		myPerson2.setAge(32);      
		
		Person myPerson3 = new Person();
		//myPerson3.name = "Raskolnikov";//=> if attributes(name and age) are private we dont access like that 
		//myPerson3.age = 23;             //=> we can access if we use getter setter methods with using public
		
		System.out.println("First Name : "+ myPerson1.getName());
		System.out.println("First Age  : "+ myPerson1.getAge());
		System.out.println("Second Name :" + myPerson2.getName());
		System.out.println("Second Age  :" + myPerson2.getAge());
		
		
	}

}
