package InterfaceRealLife;

public class Main {

	public static void main(String[] args) {

		SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckerService());
		
		signUpManager.signUp(new User("Ahmet", 258 , 20));
		
	}

}
