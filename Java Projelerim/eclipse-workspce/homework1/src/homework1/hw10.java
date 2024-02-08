package homework1;
import java.util.Scanner;
public class hw10 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("This program print numbers between 1 to 100 which are divisible by 3, 5 and by both.");
		int i;
		for(i=1;i<=100;i++)
		{
			if(i%3==0 || i%5==0) System.out.println(i);
		}
	}
}
