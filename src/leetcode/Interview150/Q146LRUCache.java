package leetcode.Interview150;

import java.util.HashMap;

public class Q146LRUCache {
    Node head; // least recently
    Node tail; // most recently
    HashMap<Integer, Node> map = new HashMap<>();
    int capacity;

    public Q146LRUCache(int capacity) {
        head = tail = new Node(0, 0);// dummy nodes
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
            remove(map.get(key));
            insert(map.get(key));
            return map.get(key).value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
            Node hold = new Node(key, value);
            insert(hold);
            map.put(key, hold);
        }
        if (map.size() >= capacity) {
            map.remove(head.next.key);
            remove(head.next);
            Node hold = new Node(key, value);
            insert(hold);
            map.put(key, hold);
        }
        else {
            Node hold = new Node(key, value);
            insert(hold);
            map.put(key, hold);
        }
    }

    public void insert(Node node) {
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;
    }

    public void remove(Node node) {
        if (head.next != tail)  {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }
}

class Node {
    int key;
    int value;
    Node next;
    Node prev;

    public Node (int key, int value) {
        this.key = key;
        this.value = value;
    }
}
