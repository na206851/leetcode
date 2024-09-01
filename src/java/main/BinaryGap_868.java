import java.util.*;

public class BinaryGap_868 {
    public int binaryGap(int n) {
        String a = Integer.toBinaryString(n);
        List<Integer> list = new ArrayList<>();
        int count = 1;
        for (char c : a.toCharArray()) {
            if (c == '0') {
                count++;
            } else if (c == '1') {
                list.add(count);
            }
            if (c == '1' && count != 1) {
                count = 1;
            }
        }

        int k = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > k) {
                k = list.get(i);
            }
        }
        return list.size() == 1 ? 0 : k;
    }
}
