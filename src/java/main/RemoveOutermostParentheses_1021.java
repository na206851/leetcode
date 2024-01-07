import java.util.Stack;

public class RemoveOutermostParentheses_1021 {

    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            }
            if (stack.size() > 1) {
                str.append(ch);
            }
            if (ch == ')') {
                stack.pop();
            }
        }
        return str.toString();
    }
}
