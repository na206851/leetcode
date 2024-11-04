public class StringCompression_3163 {

    public String compressedString(String word) {
        char[] arr = word.toCharArray();
        StringBuilder str = new StringBuilder();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] && count < 9) {
                count++;
            } else {
                str.append(count);
                str.append(arr[i - 1]);
                count = 1;
            }
        }
        str.append(count);
        str.append(word.charAt(word.length() - 1));

        return str.toString();
    }
}