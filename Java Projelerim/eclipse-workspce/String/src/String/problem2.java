package String;
import java.util.Scanner;
public class problem2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String s1 = read.nextLine();
		
		char ch1[] = s1.toCharArray();
		
		int i,count=0;
		
		for(i=0;i<s1.length();i++) {
			if( ch1[i] == ' ') 
				count++;
		}
		//count++;
		System.out.println("The sentence has "+(count+1)+" words.");

	}

}
