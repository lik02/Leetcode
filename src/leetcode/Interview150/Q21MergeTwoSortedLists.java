package leetcode.Interview150;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Q21MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        else if (list2 == null) {
            return list1;
        }
        ListNode c1 = list1;
        ListNode c2 = list2;
        if (list1.val > list2.val) {
            c1 = list2;
            c2 = list1;
        }
        while (c2 != null) {
            while (c1.next != null && c2.val > c1.next.val) {//case1: list1: -10,-10,-9,-4 list2: -7 , list2 with 1 element //case 2 : list1: 1,2,4 list2: 5
                c1 = c1.next;
            }
            ListNode node = new ListNode(c2.val, c1.next);
            c1.next = node;
            c2 = c2.next;
        }
        return list1.val > list2.val ? list2 : list1;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
