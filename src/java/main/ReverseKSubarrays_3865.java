import java.util.Stack;

public class ReverseKSubarrays_3865 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 3, 5, 6};
        int k = 3;
        reverseSubarrays(nums, k);
    }

    public static int[] reverseSubarrays(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int index = 0;
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (count < nums.length / k) {
                count++;
                stack.push(nums[i]);
            } else if (count == nums.length / k) {
                while (!stack.isEmpty()) {
                    res[index++] = stack.pop();
                }
                count = 0;
            }
        }
        return res;
    }
}
