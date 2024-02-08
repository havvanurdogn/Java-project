package calisma;

import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("This prgram calculates letter gardes.");
		int mid1,mid2,fin;
		System.out.print("Please enter the grade of first midterm:");
		mid1 = read.nextInt();
		System.out.print("Please enter the grade of second midterm:");
		mid2 = read.nextInt();
		System.out.print("Please enter the grade of final:");
		fin = read.nextInt();
		System.out.print("Please enter the average of grades:");
		double gradeavr = read.nextDouble();
		double avr=(mid1*0.3)+(mid2*0.3)+(fin*0.4);
		String lettergrade;
		if(avr>=90) {
			lettergrade = "AA";
			System.out.println("You have gotten "+lettergrade);
		}
		else if(avr>=85) {
			lettergrade = "BA";
			System.out.println("You have gotten "+lettergrade);
		}
		else if(avr>=80) {
			lettergrade = "BB";
			System.out.println("You have gotten "+lettergrade);
		}
		else if(avr>=75) {
			lettergrade = "CB";
			System.out.println("You have gotten "+lettergrade);
		}
		else if(avr>=70) {
			lettergrade = "CC";
			System.out.println("You have gotten "+lettergrade);
		}
		else if(avr>=65) {
			lettergrade = "DC";
			System.out.println("You have gotten "+lettergrade);
		}
		else if(avr>=60) {
			lettergrade = "DD";
			System.out.println("You have gotten "+lettergrade);
			if(gradeavr>=2.5) System.out.println("You have passed the lesson.\nBut you can think to get the lesson again. \nBecause your grade is low.");
			else System.out.println("You have not passed the lesson.\nYou must take the lesson again.");
		}
		else  {
			lettergrade = "FF";
			System.out.println("You have gotten "+lettergrade);
			System.out.println("You have not passed the lesson.\nYou must take the lesson again.");
		}
	}

}
