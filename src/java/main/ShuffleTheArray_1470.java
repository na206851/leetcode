import java.util.Arrays;

public class ShuffleTheArray_1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int leftX = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = nums[leftX++];
            } else {
                result[i] = nums[n++];
            }
        }
        return result;
    }

}
