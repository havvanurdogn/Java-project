package calisma;
import java.util.Scanner;
public class hipotenus {
	public static void main(String [] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("This program calculates the hypotenuse.");
		float edge1,edge2;
		double hypo;
		System.out.print("Please enter two edges: ");
		edge1=read.nextInt();
		edge2=read.nextInt();
		hypo=Math.sqrt(edge1*edge1+edge2*edge2);
		
		System.out.println("The hypotenuse is "+hypo);
	}

}
