import java.util.Scanner;
import java.util.Stack;

public class MyProject {
	
	public static double addition(double num1 , double num2) {
		return num1 + num2;
	}
	
	public static double substraction(double num1 , double num2) {
		return num1 - num2;
	}
	
	public static double multiplication(double num1 , double num2) {
		return num1 * num2;
	}

	public static double division(double num1 , double num2) {
		return num1 / num2;
	}

	public static double exponentiation(double num1 , double num2) {
		return Math.pow(num1, num2);
	}

	public static double modulo(double num1 , double num2) {
		return num1 * num2 /100;
	}
	
	public static double factorial(double num) {
		if(num == 1 || num == 0) return 1;
		return num * factorial(num-1);
	}
	
	public static double sin(double num) {
		return Math.sin(num);
	}
	
	public static double cos(double num) {
		return Math.cos(num);
	}

	public static double tan(double num) {
		return Math.tan(num);
	}

	public static double cot(double num) {
		return cos(num) / sin(num);
	}

	public static double asin(double num) {
		return Math.asin(num);
	}

	public static double acos(double num) {
		return Math.acos(num);
	}

	public static double atan(double num) {
		return Math.asin(num);
	}
	
	
	
	public static boolean opcheck(char ch) {
		if(ch == '+' ||ch == '-' ||ch == '*' ||ch == '/' ||ch == '%' ||ch == '^' )return true;
		return false;
	}
	
	public static boolean precedence(char ch) {
		if(ch == '*' || ch == '/' || ch == '^' ) return true;
		return false;
		
	}
	
	public static double calc(double numbers ,char ops) {
		
	}
	
	
	public static void changes(String eq) {
		
		Stack<Double> numbers = new Stack<Double>();
		Stack<Character> ops = new Stack<Character>();
		
		for(int i = 0 ; i < eq.length() ; i++) {
			
			char temp = eq.charAt(i);
			if(Character.isDigit(temp)) {
				
				StringBuffer sb1 = new StringBuffer();
				
				while(i < eq.length() && (Character.isDigit(eq.charAt(i)) || eq.charAt(i) == '.' || eq.charAt(i) == ',')){
		
					sb1.append(eq.charAt(i));
					i++;
					
				}
				i--;
				
				double num = Double.parseDouble(sb1.toString());
				numbers.push(num);
			}
			else if(opcheck(temp)) {
				ops.push(temp);
			}
			else if (temp == '(') {
                ops.push(temp);
            } 
			else if (temp == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    calc(numbers, ops.pop());
                }
                ops.pop(); 
            }
			else if(Character.isAlphabetic(temp)) {
				
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please write your equation : ");
		String eq = scanner.nextLine();
		
	}

}
