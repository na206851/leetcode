public class CheckIfWordOccursAsPrefixOfAnyWordInSentence_1455 {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        int count = 1;
        if (!sentence.contains(searchWord)) {
            return -1;
        } else {
            if (sentence.contains(searchWord)) {
                for (String s : arr) {
                    if (s.startsWith(searchWord)) {
                        return count;
                    } else {
                        count++;
                    }
                }
            }
        }
        return -1;
    }
}