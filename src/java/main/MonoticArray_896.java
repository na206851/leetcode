public class MonoticArray_896 {
    public boolean isMonotonic(int[] nums) {
        boolean up = false;
        boolean down = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                up = true;
            }
            if (nums[i] < nums[i - 1]) {
                down = true;
            }
            if (up && down) {
                return false;
            }
        }
        return true;
    }
}
