package lastexam;
import java.util.Scanner;
public class q1 {
	public static void TestPrime(int x) {
		int i,f=0;
		for(i=2;i<x;i++) {
			if(x % i == 0) f++;
		}
		if(f==0) System.out.println("This number is a prime number.");
		else System.out.println("This number is not a prime number.");
	}
	public static void TestOdd(int y) {
		if(y%2 != 0 ) System.out.println("This number is a odd number.");
		else System.out.println("This number is not a odd number.");
	}
	public static void main(String [] args) {
		Scanner read = new Scanner(System.in);
		int num; 
		System.out.println("Please enter an integer:");
		num = read.nextInt();
		TestPrime(num);
		TestOdd(num);
	}

}
