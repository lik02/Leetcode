package leetcode.Interview150;

public class Q2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int plus = 0;
        int hold = 0;
        ListNode prevNode1 = null;
        ListNode node1 = l1;
        ListNode node2 = l2;
        while (node1 != null && node2 != null) {
            hold = node1.val + node2.val + plus;
            plus = 0;
            if (hold > 9) {
                plus = 1;
                node1.val = hold % 10;
            }
            else {
                node1.val = hold;
            }
            prevNode1 = node1;
            node1 = node1.next;
            node2 = node2.next;
        }
        while (node1 != null) {
            hold = node1.val + plus;
            plus = 0;
            if (hold > 9) {
                plus = 1;
                node1.val = hold % 10;
            }
            else {
                node1.val = hold;
            }
            prevNode1 = node1;
            node1 = node1.next;
        }
        while (node2 != null) {
            hold = node2.val + plus;
            plus = 0;
            if (hold > 9) {
                prevNode1.next = new ListNode(hold % 10);
                plus = 1;
            }
            else {
                prevNode1.next = new ListNode(hold);
            }
            prevNode1 = prevNode1.next;
            node2 = node2.next;
        }
        if (plus == 1) {
            prevNode1.next = new ListNode(1);
        }
        return l1;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}