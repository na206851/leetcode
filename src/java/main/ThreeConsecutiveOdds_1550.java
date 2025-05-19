import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeConsecutiveOdds_1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        if (arr.length <= 2) {
            return false;
        }
        for (int i : arr) {
            if (i % 2 == 1) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}
