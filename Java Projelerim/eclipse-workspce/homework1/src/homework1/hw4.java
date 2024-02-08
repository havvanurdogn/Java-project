package homework1;
import java.util.Scanner;
public class hw4 {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int num1,num2,i=0,sum=0;
		System.out.println("This program multiply two given integers without using the multiply operator.");
		System.out.print("Please enter first integer:");
		num1 = read.nextInt();
		System.out.print("Please enter second integer:");
		num2 = read.nextInt();
		for(i=0;i<num2;i++) {
			sum += num1;
		}
		System.out.println("Result of multiply is "+sum);
	}
}
