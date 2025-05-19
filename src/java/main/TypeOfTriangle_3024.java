import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TypeOfTriangle_3024 {

    public String triangleType2(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> triangle = new HashSet<>();
        for (int i : nums) {
            triangle.add(i);
        }
        if (nums[0] + nums[1] > nums[2]) {
            if (triangle.size() == 1) {
                return "equilateral";
            } else if (triangle.size() == 2) {
                return "isosceles";
            } else {
                return "scalene";
            }
        } else {
            return "none";
        }
    }
}
