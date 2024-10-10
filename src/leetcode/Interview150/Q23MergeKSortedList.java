import java.util.ArrayList;
import java.util.Collections;

public class Q23MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode cur = lists[i];
            while (cur != null) {
                list.add(cur.val);
                cur = cur.next;
            }
        }
        Collections.sort(list);
        if (!list.isEmpty()) {
            head = new ListNode(list.get(0));
        }
        ListNode cur = head;
        for (int i = 1; i < list.size(); i++) {
            ListNode hold = new ListNode(list.get(i));
            cur.next = hold;
            cur = cur.next;
        }
        if (cur != null) {
            cur.next = null;
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