package leetcode.Interview150;

import java.util.ArrayList;

public class Q61RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {// edge case
            return head;
        }
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur);
            cur = cur.next;
        }
        while (k > list.size()) {
            k -= list.size();
        }
        if (k == list.size()) {
            return head;
        }
        head = list.get(list.size() - k);
        list.get(list.size() - 1).next = list.get(0);
        list.get(list.size() - k - 1).next = null;
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