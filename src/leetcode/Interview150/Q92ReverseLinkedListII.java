package leetcode.Interview150;

import java.util.ArrayList;

public class Q92ReverseLinkedListII {
   public ListNode reverseBetween(ListNode head, int left, int right) {
      if (left == right) {
         return head;
      }
      ArrayList<ListNode> list = new ArrayList<>();
      ListNode current = head;
      while (current != null) {
         list.add(current);
         current = current.next;
      }
      list.add(null);
      for (int i = right - 1; i >= left; i--) {
         list.get(i).next = list.get(i - 1);
      }
      if (left == 1) {
         head = list.get(right - 1);
         list.get(0).next = list.get(right);
      }
      else {
         list.get(left - 2).next = list.get(right - 1);
         list.get(left - 1).next = list.get(right);
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