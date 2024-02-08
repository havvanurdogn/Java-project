package exam;
import java.util.Scanner;
public class question3 {
	public static void EvenDigits(int x) {
		int digit,count=0;
		while(x>0) {
			
			digit = x%10;
			if(digit%2 == 0) {
				count++;
			}
			x /= 10;
		}
		System.out.println("Number of even integers in your value is: " + count);

	}
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num,digit,count=0;
		int num2;
		System.out.println("Please enter an integer value:");
		num = input.nextInt();
		num2 = num;
		
		while (num>0) {
			
			digit = num % 10;
			if(digit % 2 != 0) {
				count++;
			}
			num = num / 10;
		}	
		System.out.println("Number of odd integers in your value is: " + count);
	
		EvenDigits(num2);
	}

}
