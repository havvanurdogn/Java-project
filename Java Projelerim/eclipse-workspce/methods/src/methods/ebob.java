package methods;
import java.util.Scanner;
public class ebob {
	public static void findebob(int num1,int num2) {
		int i,biggest=1;
		for(i=1;i<=num1 && i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0) biggest = i;
		}
		System.out.println("The biggest divided is "+biggest);
		
		
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); 
		System.out.print("Please enter two integers to find the biggest divided:");
		int num1 = read.nextInt();
		int num2 = read.nextInt();
		findebob(num1,num2);
		

	}

}
