import java.math.BigInteger;

public class FactorialTrailingZeroes_172 {
    public static BigInteger factorial(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }

    public static int zero(BigInteger n) {
        int[] result = new int[100];
        int count = 0;
        while (n.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            count++;
            n = n.divide(BigInteger.TEN);
        }
        return count;
    }
}
