package homework1;
import java.util.Scanner;
public class hw12 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("This program counts the number of days from the beginning of a year when a data is given for the same year.");
        int i,sum=0,enday,enmonth,enyear;
        System.out.print("Please enter the date(like 10 02 2021):");
        enday = read.nextInt();
        enmonth = read.nextInt();
        enyear = read.nextInt();  
        for(i=1;i<enmonth;i++) {
        	sum += 30;
        }
        for(i=1;i<=enday;i++) {
        	sum ++;
        }
        System.out.println("The number of days is "+sum);	
	}
}
