package calisma;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("This program finds entered year is a leap year or not.");
		System.out.println("Please enter a year:");
		int year = read.nextInt();
		if(year%4==0) {
			System.out.println("This year is a leap year.");
		}
		
		else System.out.println("That year is not a leap year.");

	}

}
