package exam;
import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num,gcc,max1=0,max2=0,i,x,a,p1=0,p2=0;
		System.out.println("This program display the position of second maximum value of given unknown number of integers.");
		System.out.println("Please enter an integer:");
		num = read.nextInt();
		gcc=num;
		for(i=0;gcc>0;i++) {
			gcc/=10;
		}
		x = i++;
		i=1;
		while(num>0) {
			a = num%10;
			if(max1<a) {
				max2 = max1; 
				p2=p1;
				p1=i;
				max1 = a; 
			}
			else if(max2<a && max1>a) {
				max2 = a;
				p2 = i;
			}
			num /= 10;
			i++;
		}
		System.out.println("The position of second maximum value that "+max2+" is "+(x-p2));

	}

}
