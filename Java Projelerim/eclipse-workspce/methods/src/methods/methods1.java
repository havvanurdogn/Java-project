package methods;
import java.util.Scanner;
public class methods1 {
	public static void facto(int num) {
		int facto=1;
		while(num>0) {
			facto*=num;
			num--;
		}
		System.out.println("Factorial of entered number is "+facto);
		
	}

	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		System.out.println("This program calculates factorial of entered number.");
		System.out.print("Please enter an integer:");
		int num = read.nextInt();
		facto(num);

	}

}
