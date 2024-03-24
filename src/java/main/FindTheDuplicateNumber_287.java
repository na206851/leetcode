import java.util.Arrays;

public class FindTheDuplicateNumber_287 {
    public int findDuplicate(int[] nums) {
        int i = 0;
        int j = 1;
        Arrays.sort(nums);
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                return nums[i];
            }
            j++;
            i++;
        }
        return -1;
    }
}
