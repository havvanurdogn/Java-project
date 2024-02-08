package methods;
//import java.util.Scanner;
public class primenumbers {
	public static void primenum() {
		int i = 2,j = 2,flag=0;
		while (i<=1000)
		{
			j = 2;
			flag=0;
			while(j<=i)
			{
				
				if(i==j);
				else if(i%j==0) flag++;
				j++;	
			}
			if(flag==0) System.out.println(i);
			i++;

		}
	}

	public static void main(String[] args) {
		//Scanner read =new Scanner(System.in);
		System.out.println("This program sorts prime numbers 1 to 1000.");
		primenum();

	}

}
