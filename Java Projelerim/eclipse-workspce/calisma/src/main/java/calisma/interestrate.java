package calisma;
import java.util.Scanner;
public class interestrate {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int mainmoney,year,i;
		System.out.println("This program calculates sum of money with interest rate: %6.");
		System.out.print("Please enter the your main money: ");
		mainmoney= read.nextInt();
		System.out.print("Please enter how many year keep your money in bank: ");
		year= read.nextInt();
		double interest = 0.06,summoney;
		summoney=mainmoney;
		for(i=1;i<=year;i++)
		{
			summoney=(summoney*interest)+summoney;
			System.out.println("After "+i+" year you have "+(int)summoney+" money.");
		}
		

	}

}
