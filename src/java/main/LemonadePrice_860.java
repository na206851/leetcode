import java.util.Stack;

public class LemonadePrice_860 {

    public boolean lemonadeChange(int[] bills) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack10 = new Stack<>();
        int j = 0;
        for (int i : bills) {
            j = i;
            if (j == 5) {
                stack.push(i);
            } else if (j == 10) {
                while (j != 5) {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    j -= stack.pop();
                }
                stack10.push(i);
            } else if (j == 20) {
                if (!stack10.isEmpty()) {
                    j -= stack10.pop();
                }
                while (j != 5) {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    j -= stack.pop();
                }
            }
        }
        return true;
    }
}

