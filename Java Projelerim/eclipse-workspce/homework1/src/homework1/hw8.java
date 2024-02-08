package homework1;
import java.util.Scanner;
public class hw8 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("This program prints that middle digit of integer.");
		int i,a,num,gcc,x=0,y=0;
		System.out.print("Please enter a integer:");
		num = read.nextInt();
		gcc=num;
		for(i=0;gcc != 0;i++) {
			gcc /= 10;
		}
		a=i;
		gcc=num;
		if(a%2 == 0) {
			for(i=0;i<(a/2);i++) {
				x = gcc%10;
				gcc /= 10;
			}
			for(i=0;i<(a/2)+1;i++) {
				y = num%10;
				num /= 10;
			}
			System.out.println("You have 2 middle digits;These are "+y+" and "+x);
		}
		else {
			for(i=0;i<(a+1)/2;i++) {
				x = num%10;
				num /= 10;
			}
			System.out.println("The middle digit is "+x);
		}
	}
}
