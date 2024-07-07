public class WinnerOfTheLinkedListGame_3062 {
    //  Definition for singly-linked list
    public class ListNode {
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
    }

    public String gameResult(ListNode head) {
        int Odd = 0;
        int Even = 0;
        while (head != null) {
            if (head.val > head.next.val) {
                Odd++;
            } else {
                Even++;
            }
            head = head.next.next;
        }
        if (Odd == Even) {
            return "Tie";
        }
        return Odd < Even ? "Odd" : "Even";
    }
}
