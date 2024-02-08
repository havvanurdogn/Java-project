package calisma;
import java.util.Scanner;
public class oddeven {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("This program controls number if odd or even.");
		int num1,num2;
		System.out.println("Please enter an integer:");
		num1=read.nextInt();
		if(num1%2==0)
		{
			System.out.println("This integer is even.");
		}
		else System.out.println("This integer is odd.");
		

	}

}
