package leetcode.Interview150;

import java.util.ArrayList;

public class Q19REmoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current);
            current = current.next;
        }
        list.add(null);
        if (list.size() - n - 1 == 0) {
            head = list.get(1);
        }
        else {
            list.get(list.size() - n - 2).next = list.get(list.size() - n);
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