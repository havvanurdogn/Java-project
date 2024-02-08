package homework1;
import java.util.Scanner;
public class hw7 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int i=0,sum=0,num,a = 0;
		System.out.println("This program converts a binary number to decimal number.");
		System.out.print("Please enter a binary number: ");
		num = read.nextInt();
		while(num != 0) {
			a= num % 10;
			if(a==1) sum += Math.pow(2, i);
			num /= 10;
			i++;
		}
		System.out.println("The decimal number is "+sum);
	}
}
