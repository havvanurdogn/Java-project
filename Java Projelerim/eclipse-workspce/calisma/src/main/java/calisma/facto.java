package calisma;

import java.util.Scanner;

public class facto {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i=0,x,r=1;
		System.out.println("This program calculates factorial of entered value.");
		System.out.print("Please enter the value:");
		x=read.nextInt();
		i=x;
		for(;i>1;i--) {
			r*=i;
		}
		System.out.println("Result is "+r);
		

	}

}
