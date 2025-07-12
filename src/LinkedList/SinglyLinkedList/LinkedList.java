package LinkedList.SinglyLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if(head == null) {
            insertFirst(val);
            return;
        }
        tail.next = new Node(val);
        tail = tail.next;
        size++;
    }

    public void deleteFirst() {
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
    }

    public int delete(int index) {
        if(index > size) {
            throw new Error("Index is Out of bound");
        }
        if(index == 0) {
            int data = head.data;
            deleteFirst();
            return data;
        }
        Node temp = head;
        for(int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        int data = temp.data;
        temp.next = temp.next.next;

        if(temp.next == null) {
            tail = temp;
        }
        size--;
        return data;
    }

    public int getHead() {
        return head.data;
    }

    public int getTail() {
        return tail.data;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while(temp != null) {
            sb.append(temp.data);
            sb.append(" -> ");
            temp = temp.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
