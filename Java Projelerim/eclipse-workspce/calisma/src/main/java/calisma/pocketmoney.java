package calisma;
import java.util.Scanner;
public class pocketmoney {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("This program calculates pocket money.");
		int age,money;
		System.out.println("Please enter the age:");
		age= read.nextInt();
		if(age<=6) System.out.println("No money.");
		else if(age<13) 
		{
			money=age*20;
			System.out.println("Pocket money is "+money);
		}
		else if(age<18) 
		{
			money=age*30;
			System.out.println("Pocket money is "+money);
		}
		else System.out.println("No money.");
		
		

	}

}
