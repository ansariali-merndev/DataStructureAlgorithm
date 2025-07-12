package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(3);
        list.insertAtHead(6);
        list.insertAtHead(9);
        list.insertAtHead(12);
        list.insertAtHead(15);
        list.insertAtHead(18);
        list.insertAtTail(99);
        list.insertAtTail(98);
        list.insertAtTail(97);

        list.insertAtIndex(-1, 2);

        System.out.println("Forward Display: " + list.forwardDisplay());
        System.out.println("Backward Display: " + list.backwardDisplay());

//        list.deleteAtHead();
//        list.deleteAtTail();

        list.deleteAtIndex(2);
        System.out.println("After deleting forward: " + list.forwardDisplay());
        System.out.println("After deleting Backward: " + list.backwardDisplay());
    }
}
