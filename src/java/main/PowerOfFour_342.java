public class PowerOfFour_342 {
    public boolean isPowerOfFour(int n) {
        for (int i = 0; i <= 15; i++) {
            int tmp = (int) Math.pow(4, i);
            if (tmp == n)
                return true;
            if (tmp > n)
                return false;
        }
        return false;
    }
}
