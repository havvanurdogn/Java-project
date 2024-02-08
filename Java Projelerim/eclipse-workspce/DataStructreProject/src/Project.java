import java.util.Scanner;
import java.util.Stack;

public class Project {

    public static double calculateExpression(String expression) {
    	
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                StringBuilder numBuilder = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    numBuilder.append(expression.charAt(i));
                    i++;
                }
                i--;

                double num = Double.parseDouble(numBuilder.toString());
                numbers.push(num);
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && hasHigherPrecedence(c, operators.peek())) {
                    applyOperator(numbers, operators.pop());
                }
                operators.push(c);
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    applyOperator(numbers, operators.pop());
                }
                operators.pop(); // Pop the '('
            } else {
                // Invalid character
                System.err.println("Error: Invalid character '" + c + "'");
                return Double.NaN;
            }
        }

        while (!operators.isEmpty()) {
            applyOperator(numbers, operators.pop());
        }

        if (numbers.size() == 1) {
            return numbers.pop();
        } else {
            System.err.println("Error: Invalid expression");
            return Double.NaN;
        }
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '%' || c == '!' || c == 's' || c == 'c' || c == 't';
    }

    private static boolean hasHigherPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        return (op1 != '^' && op1 != '!' && op1 != 's' && op1 != 'c' && op1 != 't') || (op2 != '^' && op2 != '!' && op2 != 's' && op2 != 'c' && op2 != 't');
    }

    private static void applyOperator(Stack<Double> numbers, char operator) {
        if (operator == '!') {
            numbers.push(factorial(numbers.pop()));
        } else if (operator == 's' || operator == 'c' || operator == 't') {
            double operand = numbers.pop();
            switch (operator) {
                case 's':
                    numbers.push(Math.sin(operand));
                    break;
                case 'c':
                    numbers.push(Math.cos(operand));
                    break;
                case 't':
                    numbers.push(Math.tan(operand));
                    break;
            }
        } else {
            double operand2 = numbers.pop();
            double operand1 = numbers.pop();

            switch (operator) {
                case '+':
                    numbers.push(operand1 + operand2);
                    break;
                case '-':
                    numbers.push(operand1 - operand2);
                    break;
                case '*':
                    numbers.push(operand1 * operand2);
                    break;
                case '/':
                    numbers.push(operand1 / operand2);
                    break;
                case '^':
                    numbers.push(Math.pow(operand1, operand2));
                    break;
                case '%':
                    numbers.push(operand1 % operand2);
                    break;
            }
        }
    }

    private static double factorial(double n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Please write the equation : ");
        String expression = scanner.nextLine();
        System.out.println(expression + " = " + calculateExpression(expression));

    }
}
