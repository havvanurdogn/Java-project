package methods;
import java.util.Scanner;
public class maxvalue {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		int max,i,x,n;
		System.out.println("This program finds max of n integers.");
		System.out.print("Please enter n: ");
		n=read.nextInt();
		
		max=0;
		
		for(i=1;i<=n;i++) 
		{
			System.out.print("Please enter an integer:");
			x=read.nextInt();
			if(x>max) max=x;
		}
		System.out.println("Max value is "+max);

	}

}
