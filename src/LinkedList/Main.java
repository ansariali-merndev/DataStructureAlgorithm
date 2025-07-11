package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(12);
        list.insertFirst(2);
        list.insertFirst(8);

        list.insertLast(99);
        list.insertLast(-8);
        list.insertLast(-3);

        System.out.println("Linked List " + list.toString());
        System.out.println("Head: " + list.getHead());
        System.out.println("tail " + list.getTail());

        list.deleteFirst();
        System.out.println(list.toString());
        System.out.println("Head: " + list.getHead());
        System.out.println("Size: " + list.getSize());
        System.out.println("delete: " + list.delete(4));

    }
}
