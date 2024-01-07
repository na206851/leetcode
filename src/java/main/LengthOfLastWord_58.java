import java.util.Stack;

public class LengthOfLastWord_58 {

    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }

    public int lengthOfLastWord_2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                stack.push(s.charAt(i));
            } else {
                break;
            }
        }
        return stack.size();
    }
}

