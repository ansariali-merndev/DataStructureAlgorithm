package LinkedList.DoublyLinkedList;

public class Node {
    int data;
    Node prev;
    Node next;

    public Node(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}
