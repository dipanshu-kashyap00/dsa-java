package Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int n = tokens.length;
        for (int i = 0; i < n; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                int val = Integer.parseInt(tokens[i]);
                stack.push(val);
            } else {
                int a = stack.pop();
                int b = stack.pop();
                if (tokens[i].equals("+")) {
                    stack.push(a + b);
                } else if (tokens[i].equals("-")) {
                    stack.push(b - a);
                } else if (tokens[i].equals("*")) {
                    stack.push(a * b);
                } else {
                    stack.push(b / a);
                }
            }
        }
        return stack.pop();
    }

}
