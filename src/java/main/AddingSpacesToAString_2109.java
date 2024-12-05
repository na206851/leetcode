public class AddingSpacesToAString_2109 {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        int countSpacesIndex = 0;
        for (char c : s.toCharArray()) {
            if (countSpacesIndex < spaces.length && i == spaces[countSpacesIndex]) {
                str.append(" ");
                countSpacesIndex++;
            }
            str.append(c);
            i++;
        }
        return str.toString();
    }
}
