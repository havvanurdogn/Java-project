package homework1;
import java.util.Scanner;
public class hw6 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("This program adds two binary numbers.");
		int i,num1,num2,sum=0,a=0,b=0;
		System.out.print("Please enter first binary number:");
		num1 = read.nextInt();
		System.out.print("Please enter second binary number:");
		num2 =read.nextInt();
		for(i=0;i<num2 && i<num1;i++) {
			if(num1 ==0) {
				b = (int) (num2%10);
				num2 /= 10;
				if(b==0) sum+=0;
				else sum+=(int) Math.pow(10, i);
			}
			else if(num2 ==0) {
				a = (int) (num1%10);
				num1 /= 10;
				if(a==0) sum+=0;
				else sum+=(int) Math.pow(10, i);
			}
			else {
				a = (int) (num1%(Math.pow(10, i)));
				b = (int) (num2%(Math.pow(10, i)));
				
				if(a==0 && b==0) {
					sum+=0;
				}
				else if(a==0 && b==1) {
					sum+=(int) Math.pow(10, i);
				}
				else if(a==1 && b==0) {
					sum+=(int) Math.pow(10, i);
				}
				else if(a==1 && b==1) {
					sum+=(int) Math.pow(10, i+1);
				}
			}
			
		}
		System.out.println("Sum is "+sum);
	}
}
