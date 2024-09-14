package leetcode.Interview150;

import java.util.ArrayList;

public class Q86PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode stay = head;
        ListNode find = head;
        ArrayList<Integer> list = new ArrayList<>();
        
        while (find != null) {
            if (find.val < x) {
                stay.val = find.val;
                stay = stay.next;
            }
            else {
                list.add(find.val);
            }
            find = find.next;
        }
        for (int i = 0; i < list.size(); i++) {
            stay.val = list.get(i);
            stay = stay.next;
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