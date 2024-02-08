package homework1;
import java.util.Scanner;
public class hw9 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("This program accepts an integer (n) and computes the value of n + nn + nnn");
		int n,i,sum=0,gcc=0;
		System.out.print("Please enter an integer:");
		n = read.nextInt();
		for(i=0;i<3;i++)
		{
			sum += n*(Math.pow(10,i));
			gcc += sum;
		}
		System.out.println("Result is "+gcc);
	}
}
