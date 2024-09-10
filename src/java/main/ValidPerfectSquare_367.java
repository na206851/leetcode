public class ValidPerfectSquare_367 {
    public boolean isPerfectSquare(int num) {
        for (int i = 0; i < Integer.MAX_VALUE / 128; i++) {
            if (i * i == num) {
                return true;
            }
            if (i * i > num) {
                return false;
            }
        }
        return false;
    }

    public boolean isPerfectSquareV2(int num) {
        int d = (int) Math.sqrt(num);
        return d * d == num;
    }
}
