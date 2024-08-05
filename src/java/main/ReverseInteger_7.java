import java.util.Stack;

public class ReverseInteger_7 {

    public int reverse(int x) {
        Stack<Integer> stack = new Stack<>();
        long a = 0;
        while (x != 0) {
            stack.push(x % 10);
            x = x / 10;
        }
        long o = 1;
        while (!stack.isEmpty()) {
            a = a + stack.pop() * o;
            o *= 10;
        }
        if (a <= Integer.MIN_VALUE || a >= Integer.MAX_VALUE) return 0;
        return (int) a;
    }
}
