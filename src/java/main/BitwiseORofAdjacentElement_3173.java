import java.util.Arrays;

public class BitwiseORofAdjacentElement_3173 {
    public int[] orArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i - 1] | nums[i];
        }
        return Arrays.copyOf(nums, nums.length - 1);
    }
}
