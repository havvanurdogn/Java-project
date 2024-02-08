package Final;
import java.util.Scanner;
public class Q1 {
	
	public static boolean checkFibo(int num) {
        int x = 0 , y = 1 , gcc ;
        while (y < num) {
            gcc = y;
            y = x + y;
            x = gcc;
        }
        return (y == num || x == num);
    }

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int num = read.nextInt();
        read.close();

        if (checkFibo(num))
        	System.out.println(num + " is a Fibonacci number.");
            
        else 
        	System.out.println(num + " is not a Fibonacci number.");
            
    }

    


}


