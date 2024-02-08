package calisma;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Donem2 {

	public static void main(String[] args) {
		
		DecimalFormat df1 = new DecimalFormat("#.#################################################################");
		
		Scanner scanner = new Scanner(System.in);
		
		double f=0 , fderivative = 0, x = 0, xnext = 0, calculator = 0, xnextreal = 0, nerror = 0 , ierror = 0;
		
		System.out.print("Please enter x(n) : ");
		x = scanner.nextDouble();
		
		System.out.print("Please enter x(n+1) : ");
		xnextreal = scanner.nextDouble();
		
		System.out.println("********************************************************");
		
		for(int i = 0 ; i < 3 ; i++) {
			
			f = (-(2.1266 * x ) + 4343.8);

			fderivative =-2.1266;
			
			calculator = f / fderivative ;
			
			xnext = x - calculator ;
			
			nerror = ((xnext - xnextreal) / xnextreal) * 100;
			
			ierror =  ((xnext - x) / x) ;
			
			x = xnext;
			
			System.out.println("x(n+1) = " + df1.format(xnext));
			System.out.println((i+1) + ". Numerical error : " + df1.format(nerror));
			System.out.println((i+1) + ". Iterative error : " + df1.format(ierror));
			System.out.println("********************************************************");		
		}
		
		
	}

}


