import java.util.*;

public class MyCalculator {
	
	private static boolean opscheck(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '%' || ch == '!' || ch == 's' ||
                ch == 'c' || ch == 't' || ch == 'a' || ch == 'b' || ch == 'g' || ch == 'd' || ch == 'l' || ch == 'n' ||
                ch == 'o';
    }
	
    private static double factorial(double num) {
    	if(num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }
	
    public static double calc(String eq) {
        Stack<Double> numbers = new Stack<Double>();
        Stack<Character> ops = new Stack<Character>();
        
        for (int i = 0; i < eq.length(); i++) {
            char temp = eq.charAt(i);
            
            if (Character.isDigit(temp)) {
                StringBuilder sb1 = new StringBuilder();
                
                while (i < eq.length() && (Character.isDigit(eq.charAt(i)) ||
                        eq.charAt(i) == '.')) {
                    sb1.append(eq.charAt(i));
                    i++;
                }
                
                i--;
                double operand = Double.parseDouble(sb1.toString());
                numbers.push(operand);
                
            } 
            else if (opscheck(temp)) {
                while (!ops.isEmpty() && precedence(temp, ops.peek())) {
                    operator(numbers, ops.pop());
                }
                ops.push(temp);
                
            } 
            else if (temp == '(') {
                ops.push(temp);
                
            } 
            else if (temp == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    operator(numbers, ops.pop());
                }
                ops.pop(); 
                
            } 
            else {
                System.err.println("Entering wrong input : " + temp);
                System.exit(1);
            }
        }
        
        while (!ops.isEmpty()) {
            operator(numbers, ops.pop());
        }
        
        if (numbers.size() == 1) {
            return numbers.pop();
        } 
        else {
            System.err.println("Wrong input.");
            System.exit(1);
            return Double.NaN;
        }
    }

    private static boolean precedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }

        return (op1 != '^' && op1 != '!' && op1 != 's' && op1 != 'c' && op1 != 't' && op1 != 'a' && op1 !=
                'b' && op1 != 'g' && op1 != 'd' && op1 != 'l' && op1 != 'n' && op1 != 'o') ||
                (op2 != '^' && op2 != '!' && op2 != 's' && op2 != 'c' && op2 != 't' && op2 != 'a' && op2 != 'b'
                        && op2 != 'g' && op2 != 'd' && op2 != 'l' && op2 != 'n' && op2 != 'o');
    }

    private static void operator(Stack<Double> numbers, char op) {
        if (op == '!') {
            numbers.push(factorial(numbers.pop()));
        } 
        else if (op == 's' || op == 'c' || op == 't' || op == 'a' || op == 'b'
                || op == 'g' || op == 'd') {
            trigonometri(numbers, op);
        } 
        else if (op == 'l' || op == 'n' || op == 'o') {
            logaritma(numbers, op);
        } 
        else {
            double num2 = numbers.pop();
            double num1 = numbers.pop();
            switch (op) {
                case '+':
                    numbers.push(num1 + num2);
                    break;
                case '-':
                    numbers.push(num1 - num2);
                    break;
                case '*':
                    numbers.push(num1 * num2);
                    break;
                case '/':
                    numbers.push(num1 / num2);
                    break;
                case '^':
                    numbers.push(Math.pow(num1, num2));
                    break;
                case '%':
                    numbers.push(num1 % num2 * 100);
                    break;
            }
        }
    }

    private static void trigonometri(Stack<Double> numbers, char op) {
        double num = numbers.pop();
        switch (op) {
            case 's':
                numbers.push(Math.sin(num));
                break;
            case 'c':
                numbers.push(Math.cos(num));
                break;
            case 't':
                numbers.push(Math.tan(num));
                break;
            case 'a':
                numbers.push(Math.toDegrees(Math.asin(num)));
                break;
            case 'b':
                numbers.push(Math.toDegrees(Math.acos(num)));
                break;
            case 'g':
                numbers.push(Math.toDegrees(Math.atan(num)));
                break;
            case 'd':
                numbers.push(Math.toDegrees(1 / Math.tan(num)));
                break;
        }
    }

    private static void logaritma(Stack<Double> numbers, char op) {
        double num = numbers.pop();
        switch (op) {
            case 'l':
                numbers.push(Math.log(num));
                break;
            case 'n':
                numbers.push(Math.log10(num));
                break;
            case 'o':
                numbers.push(Math.log1p(num));
                break;
        }
    }


    public static void main(String[] args) {
        System.out.println("Please enter the equation :");
        Scanner scanner = new Scanner(System.in);
        String eq = scanner.nextLine();
        double result = calc(eq);
        System.out.println("Result : " + result);
    }
}
