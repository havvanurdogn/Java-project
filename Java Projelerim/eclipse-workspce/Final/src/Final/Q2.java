package Final;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
	    
		Scanner read = new Scanner(System.in);
		
        int[] monthsOfDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int birth_year , birth_month , birth_day , sum = 0;
        
        System.out.println("Enter your birth day: ");
        birth_day = read.nextInt();
        System.out.println("Enter your birth month: ");
        birth_month = read.nextInt();
        System.out.println("Enter your birth year: ");
        birth_year = read.nextInt();


        for (int year = birth_year; year <= 2017; year++) {
            for (int month = (year == birth_year ? birth_month : 1); month <= (year == 2017 ? 4 : 12); month++) {
                sum += monthsOfDay[month - 1];
            }
        }

        sum -= birth_day;
        sum += 24;

        System.out.println("You have lived " + sum + " days.");
    }
	
}


