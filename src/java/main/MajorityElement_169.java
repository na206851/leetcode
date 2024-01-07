import java.util.Stack;

public class MajorityElement_169 {

    public int majorityElement(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (stack.isEmpty()) {
                stack.push(nums[i]);
            } else if (stack.peek() == nums[i]) {
                stack.push(nums[i]);
            } else {
                stack.pop();
            }
        }
        return stack.peek();
    }
}
