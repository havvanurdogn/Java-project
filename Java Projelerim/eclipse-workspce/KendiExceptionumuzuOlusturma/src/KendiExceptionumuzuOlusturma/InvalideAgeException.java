package KendiExceptionumuzuOlusturma;

import java.io.IOException;

public class InvalideAgeException extends IOException{

	public InvalideAgeException(String message) {
		super(message);
	}
	
	public void printStackTrace() {
		
		System.out.println("Bu bir invalide age hatasidir.");
	}

	
}
