import java.util.ArrayList;
import java.util.List;

public class ConvertDoublyLinkedListToArray_3263 {
    class Node {
        public int val;
        public Node prev;
        public Node next;
    }

    class Solution {
        public int[] toArray(Node head) {
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            int[] result = new int[list.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = list.get(i);
            }
            return result;
        }
    }
}
