import java.util.ArrayList;
import java.util.Collections;

public class Q148SortList {
    public ListNode sortList(ListNode head) {
        ListNode cur = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(list);
        cur = head;
        for (int i = 0; i < list.size(); i++) {
            cur.val = list.get(i);
            cur = cur.next;
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