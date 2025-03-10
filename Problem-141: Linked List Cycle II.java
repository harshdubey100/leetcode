public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> S = new HashSet<>();
        while (head != null) {
            if (S.contains(head)) {
                return head;
            }
            S.add(head);
            head = head.next;
        }
        return head;
    }
}
