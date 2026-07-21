import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(evaluatePostfix("1 2 + 3 *"));
    }

    public static double evaluatePostfix(String expr) {
        // TODO: Implement this method
        Stack<Double> stack = new Stack<>();

        String[] tokens = expr.split(" ");

        for (String token : tokens) {
            if (token.equals("+") ||
                    token.equals("-") ||
                    token.equals("*") ||
                    token.equals("/")) {

                double right = stack.pop();
                double left = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(left + right);
                        break;
                    case "-":
                        stack.push(left - right);
                        break;
                    case "*":
                        stack.push(left * right);
                        break;
                    case "/":
                        stack.push(left / right);
                        break;
                }
            } else {
                stack.push(Double.parseDouble(token));
            }
        }

        return stack.pop();
    }
}