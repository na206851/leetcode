public class RemoveVowelsFromString_1119 {
    public String removeVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'
                    && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                res += str.charAt(i);
            }
        }
        return res;
    }
}
