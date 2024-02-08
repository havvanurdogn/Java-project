package PolindromWithStack;
import java.util.Scanner;
import java.util.Stack;
public class Main {

	public static boolean isPolindrom(String cumle , Stack<Character> stack) {
		for(int i = (cumle.length() / 2 ) + 1 ; i < cumle.length() ; i++) {
			if(cumle.charAt(i) != stack.pop()) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Lutfen bir cumle giriniz : ");
		String cumle  = read.nextLine();
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0 ; i < cumle.length() / 2 ; i++) {
			stack.push(cumle.charAt(i));
		}
		
		if(isPolindrom(cumle, stack)) {
			System.out.println("Bu cumle polindromdur.");
		}
		else {
			System.out.println("Bu cumle polindrom degildir.");
		}

	}
	

}
