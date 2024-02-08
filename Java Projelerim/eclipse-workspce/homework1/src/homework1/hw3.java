package homework1;
import java.util.Scanner;
public class hw3 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int num1,num2,i=0;
		System.out.println("This program divides the two given integers using subtraction operator.");
		System.out.print("Please enter first integer:");
		num1 = read.nextInt();
		System.out.print("Please enter second integer:");
		num2 = read.nextInt();
		while(num1>=num2) {
			num1 -= num2;
			i++;
		}
		System.out.println("Result of divided is "+i);

	}

}
