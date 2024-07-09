package leetcode;

public class Q2181MergeNodesBetweenZero {
  static ListNode head;
  static ListNode newHead;

  public static void main(String[] args) {
    int [] num = {0,3,1,0,4,5,2,0};
    for (int i = 0; i < num.length; i++) {
      addLast(num[i]);
    }

    display();


    mergeNodes(head);
    System.out.println();
    display();
  }

  public static void display() {
    ListNode current = newHead;
    while (current != null) {
      System.out.print(current.val + " ");
      current = current.next;
    }
  }

  public static void addLast(int val) {
    if (head == null) {
      head = new ListNode(val);
    }
    else {
      ListNode current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = new ListNode(val);
    }
  }
  
  public static ListNode mergeNodes(ListNode head) {
      // int sum;
      // while (head.next != null) {
      //   if (head.val == 0) {
      //     sum = 0;
      //     ListNode current = head.next;
      //     while (current.val != 0 && current.next != null) {
      //       sum += current.val;
      //       current = current.next;
      //     }
      //     head = current;
      //     if (newHead == null) {
      //       newHead = new ListNode(sum);
      //     }
      //     else {
      //       ListNode hold = newHead;
      //       while (hold.next != null) {
      //         hold = hold.next;
      //       }
      //       hold.next = new ListNode(sum);
      //     }
      //   }
      // }
      // head = newHead;
      // return head;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) { this.val = val; }

  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    
