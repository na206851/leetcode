import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class StringMatchingInAnArray_1408 {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        Arrays.sort(words);
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].contains(words[i]) && i != j) {
                    result.add(words[i]);
                }
            }
        }
        HashSet<String> set = new HashSet<>();
        set.addAll(result);

        result.clear();
        for (String s : set) {
            result.add(s);
        }
        return result;
    }
}

