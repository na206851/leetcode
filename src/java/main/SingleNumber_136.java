import java.util.Arrays;
import java.util.Stack;

public class SingleNumber_136 {

    public int singleNumber(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        Arrays.sort(nums);
        for (int n : nums) {
            if (!stack.isEmpty() && stack.peek() == n) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }
        return stack.peek();
    }
}
