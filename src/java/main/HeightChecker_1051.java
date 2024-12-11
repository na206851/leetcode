import java.util.Arrays;

public class HeightChecker_1051 {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] expected = new int[heights.length];
        int k = 0;

        for (int j : heights) {
            expected[k++] = j;
        }
        Arrays.sort(expected);
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}