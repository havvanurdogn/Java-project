package homework1;
import java.util.Scanner;
public class hw5 {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int num,sum=0;
		System.out.println("This program accept a positive number and repeatedly add all its digits until the result has only one digit.");
		System.out.print("Please enter a positive number:");
		num = read.nextInt();
		if(num<0) System.out.println("You entered not a positive number.\nPlease try again:::");
		else {
			while(num>=10) {
				while(num>0) {
					sum += num%10;
					num /= 10;
				}
				num = sum;
				sum=0;
			}
			System.out.println("Result is "+num);
		}
	}
}
