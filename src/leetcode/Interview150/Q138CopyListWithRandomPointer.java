package leetcode.Interview150;

import java.util.ArrayList;
import java.util.HashMap;

public class Q138CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        ArrayList<Node> list = new ArrayList<>();
        HashMap<Node, Integer> map = new HashMap<>();
        Node current = head;
        while (current != null) {
            map.put(current, list.size());
            list.add(new Node(current.val));
            current = current.next;
        }
        list.add(null);
        current = head;
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
            if (current.random == null) {
                list.get(i).random = null;
            }
            else {
                list.get(i).random = list.get(map.get(current.random));
            }
            current = current.next;
        }
        return list.get(0);
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}