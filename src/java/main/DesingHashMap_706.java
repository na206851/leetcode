import java.util.Arrays;

public class DesingHashMap_706 {
    int[] map;

    public DesingHashMap_706() {
        map = new int[1000002];
        Arrays.fill(map, -1);
    }

    public void put(int key, int val) {
        map[key] = val;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }
}