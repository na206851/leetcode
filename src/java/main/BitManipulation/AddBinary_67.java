package BitManipulation;

import java.math.BigInteger;

public class AddBinary_67 {
    public static void main(String[] args) {
        AddBinary_67 test = new AddBinary_67();
        System.out.println(test.addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {
        BigInteger a1 = new BigInteger(a, 2);
        BigInteger b1 = new BigInteger(b, 2);
        BigInteger tmp = a1.add(b1);
        return tmp.toString(2);
    }
}
