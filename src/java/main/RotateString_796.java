public class RotateString_796 {

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String str = s.concat(s);
        if (str.contains(goal)) {
            return true;
        }
        return false;
    }
}
