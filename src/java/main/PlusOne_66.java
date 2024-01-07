public class PlusOne_66 {

    public int[] plusOne(int[] digits) {
        int l = digits.length;
        int i = digits.length - 1;

        if (i >= 0) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
            }
            return digits;
        } else {
            digits = new int[l + 1];
            digits[0] = 1;
            return digits;
        }
    }
}
