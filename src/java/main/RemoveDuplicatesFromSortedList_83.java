import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedList_83 {

    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new TreeSet<>();
        ListNode result = new ListNode(0);
        ListNode res = result;
        while (head != null) {
            set.add(head.val);
            head = head.next;
        }
        for (int i : set) {
            result.next = new ListNode(i);
            result = result.next;
        }
        return res.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return this.val + "";
        }
    }
}
