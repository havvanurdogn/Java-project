package exam;
import java.util.Scanner;
public class question2 {
public static void SumOfDigits(int x) {
		int sum=0,digit;
		while(x > 0) {
			
			digit = x % 10;
			sum = sum + digit;
			x /= 10;
		}
	
		System.out.println("Sum of digits is " + sum);
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num;
		System.out.print("Please enter an integer:");
		num = read.nextInt();
		SumOfDigits(num);		

	}


}
