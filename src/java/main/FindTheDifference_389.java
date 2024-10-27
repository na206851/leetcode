import java.util.Arrays;

public class FindTheDifference_389 {
    public char findTheDifference(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Arrays.sort(s.toCharArray());
        Arrays.sort(t.toCharArray());

        for (int i = 0; i < s.length(); i++) {
            if (arr[i] != arr1[i]) {
                return arr1[i];
            }
        }
        return arr1[arr1.length - 1];
    }
}