import java.util.ArrayList;

public class MinStack_155 {
    private ArrayList<Integer> list;
    private ArrayList<Integer> minValue;
    private int size;

    public MinStack_155() {
        list = new ArrayList<>();
        minValue = new ArrayList<>();
        size = 0;
    }

    public void push(int val) {
        if (size == 0) {
            minValue.add(val);
        } else {
            minValue.add(Math.min(val, minValue.get(size - 1)));
        }
        list.add(val);
        size++;
    }

    public void pop() {
        if (size > 0) {
            list.remove(size - 1);
            minValue.remove(size - 1);
            size--;
        }

    }

    public int top() {
        if (size > 0) {
            return list.get(size - 1);
        }
        return -1;
    }

    public int getMin() {
        if (size > 0) {
            return minValue.get(size - 1);
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

