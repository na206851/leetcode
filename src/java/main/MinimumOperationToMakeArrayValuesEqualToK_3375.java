import java.util.HashSet;

public class MinimumOperationToMakeArrayValuesEqualToK_3375 {

    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for (int i : nums) {
            if (i < k) {
                return -1;
            }
            set.add(i);
        }
        for (Integer i : set) {
            if (i > k) {
                count++;
            }
        }
        return count;
    }
}
