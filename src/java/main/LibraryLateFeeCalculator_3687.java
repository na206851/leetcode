public class LibraryLateFeeCalculator_3687 {
    public int lateFee(int[] daysLate) {
        int res = 0;
        for (int i : daysLate) {
            if (i == 1) {
                res += 1;
            } else if (i >= 2 && i <= 5) {
                res += i * 2;
            } else if (i > 5) {
                res += i * 3;
            }
        }
        return res;
    }
}