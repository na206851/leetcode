import java.util.Arrays;
import java.util.Stack;

public class ValidAnagram_242 {

    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if (arr.length != arr2.length) return false;

        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        int i = 0, j = 0;
        while (i < arr.length && j < arr2.length) {
            stack.push(arr[i]);
            stack1.push(arr2[j]);
            if (stack.push(arr[i]) != stack1.push(arr2[j])) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

    public boolean isAnagram_2(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        return Arrays.equals(arr, arr2);
    }
}
