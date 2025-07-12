package LinkedList.DoublyLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void insertAtHead(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void insertAtTail(int val) {
        if(tail == null) {
            insertAtHead(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        node.prev = tail;
        tail = tail.next;
        size++;
    }

    public void insertAtIndex(int val, int index) {
        if(index < 0 || index > size) {
            System.out.println("Index out of bound");
            return;
        }

        if (index == 0) {
            insertAtHead(val);
            return;
        }
        if (index == size) {
            insertAtTail(val);
            return;
        }

        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        Node node = new Node(val);
        Node nextNode = curr.next;
        curr.next = node;
        nextNode.prev = node;
        node.next = nextNode;
        node.prev = curr;
        size++;
    }

    public void deleteAtHead() {
        if(head == null) {
            return;
        }
        Node curr = head;
        head = head.next;
        curr.next = null;
        head.prev = null;

        size--;
    }

    public void deleteAtTail() {
        if(tail == null) {
            return;
        }
        Node curr = tail;
        tail = tail.prev;
        tail.next = null;
        curr.prev = null;

        size--;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            System.out.println("Index out of bound");
            return;
        }

        if(index == 0) {
            deleteAtHead();
            return;
        }

        if(index == size-1) {
            deleteAtTail();
            return;
        }

        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        Node delete = curr.next;
        curr.next = curr.next.next;
        curr.next.prev = curr;
        delete.prev = null;
        delete.next = null;
    }

    public String forwardDisplay() {
        Node curr = head;
        StringBuilder sb = new StringBuilder();
        while(curr != null) {
            sb.append(curr.data);
            sb.append(" -> ");
            curr = curr.next;
        }
        return sb.toString();
    }

    public String backwardDisplay() {
        Node curr = tail;
        StringBuilder sb = new StringBuilder();
        while(curr != null) {
            sb.append(curr.data);
            sb.append(" <- ");
            curr = curr.prev;
        }
        return sb.toString();
    }
}
