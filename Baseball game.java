import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (Character.isDigit(operations[i].charAt(0)) || operations[i].charAt(0) == '-') {
                stack.push(Integer.parseInt(operations[i]));
            } else if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("D")) {
                stack.push(2 * stack.peek());
            } else if (operations[i].equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                int c = a + b;
                stack.push(b);
                stack.push(a);
                stack.push(c);
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
