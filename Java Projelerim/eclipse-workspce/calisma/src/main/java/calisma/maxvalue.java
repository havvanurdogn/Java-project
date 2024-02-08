package calisma;
import java.util.Scanner;
public class maxvalue {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("This progs finds the max value of the entered integers.");
		int a,b,c,max;
		System.out.println("Please enter 1st value:");
		a=read.nextInt();
		max=a;
		System.out.println("Please enter 2nd value:");
		b=read.nextInt();
		System.out.println("Please enter 3rd value:");
		c=read.nextInt();
		if(max<b) max=b;
		if (max<c) max=c;
		System.out.println("Max value is "+max);
		

	}

}
