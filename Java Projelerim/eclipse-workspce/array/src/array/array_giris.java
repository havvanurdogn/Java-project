package array;
import java.util.Scanner;
public class array_giris {
	public static void main( String [] args ) {
		Scanner read = new Scanner(System.in);
		int [] x = new int [3];
		int i,max,n;
		System.out.print("Please enter the number of element array:");
		n=read.nextInt();
		for(i=0;i<n;i++) {
			System.out.print("Please enter the element:");
			x[i]=read.nextInt();
		}
		System.out.println(x.length);
		max=x[0];
		for(i=1;i<n;i++) {
			if(max<x[i]) max= x[i];
		}
		System.out.println("Maximum element is "+max);
	}

}
