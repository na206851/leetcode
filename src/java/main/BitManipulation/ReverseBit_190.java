package BitManipulation;

public class ReverseBit_190 {
    public static void main(String[] args) {
        ReverseBit_190 test = new ReverseBit_190();
        System.out.println(test.reverseBits(Integer.parseInt("00000010100101000001111010011100", 2)));

    }

    public int reverseBits(int n) {
        int a = 0;
        int i = 0;
        while (i < 32) {
            a = a << 1;
            a = a | n & 1;
            n = n >> 1;
            i++;
        }
        return a;
    }
}
