public class ConcatenationArray_1929 {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[count++];
            if (count == nums.length) {
                count = 0;
            }
        }
        return result;
    }
}
