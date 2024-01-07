
public class ValidPalindrome_125 {

    public boolean validPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder str = new StringBuilder();
        str.append(result).reverse();
        System.out.println(result + " " + str);
        return str.toString().equals(result);

    }
}
