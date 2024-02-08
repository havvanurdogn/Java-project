package homework1;
import java.util.Scanner;
public class hw1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num1,num2,gcd=1,i;
		System.out.println("This program proves that Euclid's algorithm computes the greatest common divisor of two positive given integers.");
		System.out.print("Please enter first integer:");
		num1=read.nextInt();
		System.out.print("Please enter second integer:");
		num2=read.nextInt();
		for(i=1;i<=num1;i++)
		{
			if(num1%i==0)
			{
				if(num2%i==0) gcd=i;
			}
		}
		System.out.println("The greatest common divisor is "+gcd);
	}

}
