public class TransformArrayToParity_3467 {
    public int[] transformArray(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
                count++;
            } else {
                nums[i] = 1;
            }
        }
        int index = 0;
        while (index != nums.length) {
            if (index < count) {
                nums[index++] = 0;
            } else {
                nums[index++] = 1;
            }
        }
        return nums;
    }
}
