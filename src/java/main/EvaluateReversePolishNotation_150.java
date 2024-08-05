import java.util.Stack;

public class EvaluateReversePolishNotation_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String i : tokens) {
            if (isNums(i)) {
                stack.push(Integer.parseInt(i));
            } else {
                int tmp1 = stack.pop();
                int tmp2 = stack.pop();
                int result = 0;
                switch (i) {
                    case "+":
                        result = tmp1 + tmp2;
                        break;
                    case "-":
                        result = tmp2 - tmp1;
                        break;
                    case "*":
                        result = tmp1 * tmp2;
                        break;
                    case "/":
                        result = tmp2 / tmp1;
                        break;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private boolean isNums(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}

