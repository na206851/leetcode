import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumCommonValue_2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        List<Integer> arr1 = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int k : nums1) {
            arr1.add(k);
        }
        int i = 0;
        int j = 0;
        while (j < arr1.size() && i < nums2.length) {
            if (arr1.get(j).equals(nums2[i])) {
                return arr1.get(j);
            } else if (arr1.get(j) < nums2[i]) {
                j++;
            } else {
                i++;
            }
        }
        return -1;
    }
}