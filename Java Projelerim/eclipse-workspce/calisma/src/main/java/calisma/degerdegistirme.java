package calisma;
import java.util.Scanner;
public class degerdegistirme {
	public static void main(String []args) {
		Scanner read= new Scanner(System.in);
		int a,b,c;
		System.out.println("This program changes the integers that entered value.");
		System.out.print("Please enter first integer:");
		a=read.nextInt();
		System.out.print("please enter second integer:");
		b=read.nextInt();
		System.out.println("Before displacement first integer: "+a+" second integer: "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After displacement 1st integer: "+a+" 2nd integer: "+b);
		
	}

}
