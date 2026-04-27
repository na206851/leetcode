public class TrucateSentence_1816 {
    public static String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        int count = 0;
        while (count != k) {
            res.append(arr[count++] + " ");
        }
        res.trimToSize();
        return res.toString();
    }
}