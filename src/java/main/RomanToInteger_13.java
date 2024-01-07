import java.util.HashMap;

class RomanToInteger_13 {

    public int romanToInt(String s) {
        int result = 0;

        HashMap<Character, Integer> romanNumberAndTheirMeaning = new HashMap<>();
        romanNumberAndTheirMeaning.put('I', 1);
        romanNumberAndTheirMeaning.put('V', 5);
        romanNumberAndTheirMeaning.put('X', 10);
        romanNumberAndTheirMeaning.put('L', 50);
        romanNumberAndTheirMeaning.put('C', 100);
        romanNumberAndTheirMeaning.put('D', 500);
        romanNumberAndTheirMeaning.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romanNumberAndTheirMeaning.get(s.charAt(i)) < romanNumberAndTheirMeaning.get(s.charAt(i + 1))) {
                result -= romanNumberAndTheirMeaning.get(s.charAt(i));
            } else {
                result += romanNumberAndTheirMeaning.get(s.charAt(i));
            }
        }
        return result;
    }
}
