package Lab4_Michael_Zhao;

import java.util.Stack;

public class PostfixEvaluation {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        /*
         * Postfix expression: 5 2 4 * + 7 -
         * Stack: 6
         */
        String expression = "5 2 4 * + 7 -";
        System.out.println("Postfix expression: " + expression);
        System.out.println("Evaluation result: " + evaluatePostfix(expression)); // Outputs 6
    }
}
