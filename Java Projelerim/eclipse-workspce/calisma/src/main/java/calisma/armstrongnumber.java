package calisma;
import java.util.Scanner;
public class armstrongnumber {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("This program finds entered number is armstrong number or is not.");
		System.out.println("Please enter a number:");
		int num = read.nextInt();
		int i,dnm=num,dnm2=num,d=0,sum=0,y,x=1,j;
		do {
			dnm /= 10;
			d++;
		}while(dnm>0);
		
		
		System.out.println("Entered value has "+d+" digit number.");
		
		
		for(i=0;i< d;i++)
		{
			y=dnm2%10;
			dnm2/=10;
			
			
			for(j=0;j<d;j++)
			{                    
				x *= y;
			}
			
			
			sum += x;
			x=1;
			System.out.println("Sum is "+sum);
		}
		
		
		if(sum==num) System.out.println("This number is an armstrong number.");
		else System.out.println("This number is not an armstrong number.");

	}

}
