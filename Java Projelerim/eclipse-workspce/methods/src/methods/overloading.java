package methods;
import java.util.Scanner;
public class overloading {
	public static int multiply(int a,int b) {
		return a*b;
	}
	public static float multiply(float d,float e,float f) {
		return d*e*f;
	}

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int a,b;
		float d,e,f;
		System.out.print("Please enter two integers to multiply:");
		a= read.nextInt();
		b= read.nextInt();
		
		System.out.println("Result is " +multiply(a,b));
		System.out.print("Please enter three flaots to multiply:");
		d= read.nextFloat();
		e= read.nextFloat();
		f= read.nextFloat();
		System.out.println("Result is " +multiply(d,e,f));

	}

}
