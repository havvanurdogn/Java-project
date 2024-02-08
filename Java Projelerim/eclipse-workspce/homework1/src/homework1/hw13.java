package homework1;
import java.util.Scanner;
public class hw13 {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int i,f=0,j,num1,num2;
		double p=0,sum=0;
		System.out.println("This program print average of prime numbers between given two integers.");
		System.out.print("Please enter first integer: ");
		num1 = read.nextInt();
		System.out.print("Please enter second integer: ");
		num2 = read.nextInt();
    	for(i=num1;i<=num2;i++) {
			f=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) f++;
			}
			if(f<3) {
				sum += i;
				p++;
			}
		}
		double avr = sum / p;
		System.out.println("Average is "+avr);

	}

}
