package calisma;
import java.util.Scanner;
public class tutarhesaplama {
	public static void main(String [] args)
	{
		Scanner read =new Scanner(System.in);
		System.out.println("This program calculates to need how much money for road.");
		System.out.println("Please enter the dollars per km :");
		float perkm=read.nextFloat();
		System.out.println("Please enter the km that you will go:");
		float km=read.nextFloat();
		float money=km*perkm;
		System.out.println("You are going to spend "+money+" dollars");
		
	}

}
