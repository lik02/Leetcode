package leetcode.Interview150;

public class Q82RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            if (fast.next != null && fast.val == fast.next.val) {
                while (fast.next != null && fast.val == fast.next.val) {
                    fast = fast.next;
                }
                if (fast.val == head.val) {
                    slow = fast.next;
                    head = slow;
                }
                else {
                    slow.next = fast.next;
                }
                fast = fast.next;
                continue;
            }
            slow = fast;
            fast = fast.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}