import java.util.Arrays;

public class ShuffleTheArray_1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int[] left = Arrays.copyOfRange(nums, 0, n);
        int[] right = Arrays.copyOfRange(nums, n, nums.length);
        int leftX = 0;
        int rightY = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = left[leftX++];
            } else {
                result[i] = right[rightY++];
            }
        }
        return result;
    }

}
