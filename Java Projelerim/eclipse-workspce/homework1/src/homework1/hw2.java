package homework1;
import java.util.Scanner;
public class hw2 {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("This program converts integer to binary.");
		int j,sum=0,num;
		System.out.println("Please enter an integer:");
		num = read.nextInt();
		while(num!=0){
			for(j=0;num != 0;j++)
			{
				 if(num < Math.pow(2,(j+1))) {
					num = (int) (num % Math.pow(2, j));
					sum += (int) Math.pow(10,j );
					break;
				}
			}
		} 
		System.out.println("Binary represantation is "+sum);

	}

}
