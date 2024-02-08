package calisma;
import java.util.Scanner;
public class rootsofequations {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		double a,b,c,d;
		System.out.println("Please enter equations of coefficients(like ax^2+bx+c):");
		a=read.nextDouble();
		b=read.nextDouble();
		c=read.nextDouble();
		d=(b*b-4*a*c);
		System.out.println("Your equation is "+a+"x^2+"+b+"x+"+c);
		if( d<0 ) System.out.println("No real roots...");
		else if(d==0) {
			double root1 = (-b)/(2*a);
			double root2 = root1;
			System.out.println("You have two equal roots.These are "+root1 + " " +root2);
		}
		else {
			
				double root1 = (-b-(Math.sqrt(d)))/ 2*a;
				double root2 = (-b+(Math.sqrt(d)))/ 2*a;
			
			 System.out.println("You have two roots.These are "+root1+" and "+root2);
		}
		

	}

}
