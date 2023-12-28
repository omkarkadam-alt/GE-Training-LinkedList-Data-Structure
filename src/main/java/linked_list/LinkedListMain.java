package linked_list;

public class LinkedListMain {
    public static void main(String[] args) {
        
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();

        integerLinkedList.addNode(56);
        integerLinkedList.addNode(30);
        integerLinkedList.addNode(70);

        integerLinkedList.display();
        integerLinkedList.insertAt(2, 40);
        integerLinkedList.display();

        
    }
}