import java.util.Arrays;

public class CountBits_338 {
    public static void main(String[] args) {
        CountBits_338 test = new CountBits_338();
        System.out.println(Arrays.toString(test.countBits(5)));
    }

    public int[] countBits(int n) {
        String[] bit = new String[n + 1];

        for (int i = 0; i <= n; i++) {
            String tmp = Integer.toBinaryString(i);
            bit[i] = tmp;
        }
        int[] res = new int[bit.length];
        int i = 0;
        int count = 0;
        while (i < res.length) {
            for (char c : bit[i].toCharArray()) {
                if (c != '0') {
                    count++;
                }
                res[i] = count;
            }
            i++;
            count = 0;
        }
        return res;
    }
}
