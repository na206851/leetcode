import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchInsertPosition_35 {

    public int insertPosition(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            list.add(nums[i]);
            i++;
        }

        list.add(target);
        Collections.sort(list);
        System.out.println(list);
        for (i = 0; i < nums.length + 1; i++) {
            if (target == list.get(i)) {
                return i;
            }
        }
        return -1;
    }
}
