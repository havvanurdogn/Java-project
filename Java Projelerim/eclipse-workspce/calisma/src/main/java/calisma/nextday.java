package calisma;
import java.util.Scanner;
public class nextday {
	public static void main(String []args) {
		Scanner read= new Scanner(System.in);
		int day,month,year;
		System.out.println("Please enter the today's date(like 10 03 2023):");
		day=read.nextInt();
		month=read.nextInt();
		year=read.nextInt();
		System.out.println("Today's date is "+day+"."+month+"."+year);
		if(day<30) day++;
		else {
			if(month<12) {
				month++;
				day=1;
			}
			else {
				day=1;
				month=1;
				year++;
			}
		}
		
		System.out.println("Next day's date will be "+day+"."+month+"."+year);
		
	}
	

}
