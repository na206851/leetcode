import java.util.Arrays;

public class ThirdMaximumNumber_414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (max != nums[i]) {
                max = nums[i];
                count++;
            }
            if (count == 3) {
                break;
            }
        }
        if (count < 3) {
            max = nums[nums.length - 1];
        }
        return max;
    }
}
