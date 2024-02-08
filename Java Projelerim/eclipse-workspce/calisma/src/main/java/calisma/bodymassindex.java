package calisma;
import java.util.Scanner;
public class bodymassindex {

	public static void main(String [] args) {
		Scanner read=new Scanner (System.in);
		float length,weigth;
		double index;
		System.out.println("This program calculates your body mass index.");
		System.out.println("Please enter your length:");
		length=read.nextFloat();
		System.out.println("Please enter your weigth:");
		weigth=read.nextFloat();
		index=weigth/(length*length);
		if(index<18.5) System.out.println("You are thin.");
		else if(index<25) System.out.println("You are normal.");
		else if(index<30) System.out.println("You are overweigth.");
		else System.out.println("You are obese.");
				

	}

}
