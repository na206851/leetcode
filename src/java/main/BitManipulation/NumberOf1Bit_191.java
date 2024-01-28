package BitManipulation;

import java.util.Arrays;

public class NumberOf1Bit_191 {
    public static void main(String[] args) {
        NumberOf1Bit_191 test = new NumberOf1Bit_191();
        System.out.println(test.hammingWeight(111111111));
        System.out.println(test.hammingWeight2(111111111));
    }

    public int hammingWeight(int n) {
        int count = 0;
        String s = Integer.toString(n);
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));
        for (String i : arr) {
            if (i.equals("1")) {
                count++;
            }
        }
        return count;
    }

    public int hammingWeight2(int n) {
        int count = 0;
        int i = 0;
        while (i < 32) {
            count += n & 1;
            n >>= 1;
            i++;
        }
        return count;
    }
}
