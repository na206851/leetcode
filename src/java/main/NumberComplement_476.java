public class NumberComplement_476 {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        String result = "";
        for (char c : s.toCharArray()) {
            if (c == '0') {
                result += 1;
            } else {
                result += 0;
            }
        }
        return Integer.parseInt(result, 2);
    }
}
