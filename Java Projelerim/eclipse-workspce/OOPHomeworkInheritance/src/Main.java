public class Main { 
	
	public static void main(String[] args) { 
		
		Animal animal = new Animal("animal"); 
		Mammal mammal = new Mammal("mammal"); 
		Cat cat = new Cat("Tekir"); 
		Dog dog1 = new Dog("Boncuk"); 
		Dog dog2 = new Dog("Karabas"); 
		
		System.out.println(animal.toString()); 
		System.out.println(mammal.toString()); 
		System.out.println(cat.toString()); 
		System.out.println(dog1.toString()); 

		cat.greets(); 
		dog1.greets(); 
		dog1.greets(dog2); 

	} 

}