import java.util.Arrays;

public class MinimizeProductSumOfTwoArrays_1874 {
    public int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index2 = nums2.length - 1;
        int res = 0;
        for (int i = 0; i < nums1.length; i++) {
            res += nums1[i] * nums2[index2--];
        }
        return res;
    }
}
