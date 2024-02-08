package calisma;
import java.util.Scanner;
public class calisma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1,num2,num3,max;
		System.out.println("This program displays max of two given three integers.");
		System.out.println("Please enter the first integer:");
		num1 = in.nextInt();
		System.out.println("Please enter the second integer:");
		num2 = in.nextInt();
		System.out.println("Please enter the third integer:");
		num3= in.nextInt();
		if(num1>num2 && num1>num3)  max=num1;
		else if(num2>num1 && num2>num3) max= num2;
		else max=num3;
		System.out.println("Max of given values is "+max);

	}

}
