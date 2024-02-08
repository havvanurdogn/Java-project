package calisma;
import java.util.Scanner;
public class hesapmakinesi {
	public static void main(String [] args) {
		Scanner read=new Scanner(System.in);
		float a,b;
		double c = 0;
		System.out.println("This program calculates mathematic operations.");
		System.out.println("Please choose character(+,-,*,/)");
		String ch= read.nextLine();
		System.out.print("Please enter 1st value:");
		a=read.nextFloat();
		System.out.print("Please enter 2nd value:");
		b=read.nextFloat();
		switch(ch)
		{
			case "+": c=a+b;
			System.out.println("Result of operation is "+c);
			        break;
			case "-": c=a-b;
			System.out.println("Result of operation is "+c);
			        break;
			case "*": c=a*b;
			System.out.println("Result of operation is "+c);
			        break;
			case "/": c=a/b;
			System.out.println("Result of operation is "+c);
			        break;
			default: System.out.println("You entered wrong character.\nPlease try again:::");
			        break;
		}
		
		
		
	}
	
	
	

}
