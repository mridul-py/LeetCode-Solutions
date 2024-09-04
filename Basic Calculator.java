import java.util.Stack;

class Solution {
    private int evalRPN(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = s.split(" ");  // Split based on spaces (postfix notation tokens should be separated by spaces)

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {  // Check if the token is an integer (handles both positive and negative numbers)
                stack.push(Integer.parseInt(token));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(b + a);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(b * a);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                }
            }
        }
        return stack.pop();  // The final result
    }

    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;  // Lowest precedence
            case '*':
            case '/':
                return 2;  // Higher precedence
            default:
                return -1; // Invalid operator
        }
    }

    public String infixtoPostFix(String s) {
        Stack<Character> operators = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isWhitespace(currentChar)) { // Skip spaces
                continue;
            }
            if (Character.isLetterOrDigit(currentChar)) { 
                result.append(currentChar);
            } else if (currentChar == '(') { 
                operators.push(currentChar);
            } else if (currentChar == ')') { 
                while (!operators.isEmpty() && operators.peek() != '(') {
                    result.append(' ').append(operators.pop());
                }
                operators.pop(); // Remove the '(' from stack
            } else { // Operator encountered
                result.append(' '); // Separate operands by space
                while (!operators.isEmpty() && getPrecedence(currentChar) <= getPrecedence(operators.peek())) {
                    result.append(operators.pop()).append(' ');
                }
                operators.push(currentChar);
            }
        }

        // Pop all the remaining operators in the stack
        while (!operators.isEmpty()) {
            result.append(' ').append(operators.pop());
        }

        return result.toString().trim();
    }

    public int calculate(String s) {
        String postfix = infixtoPostFix(s.trim());  // Convert infix to postfix
        return evalRPN(postfix);  // Evaluate the postfix expression
    }
}
