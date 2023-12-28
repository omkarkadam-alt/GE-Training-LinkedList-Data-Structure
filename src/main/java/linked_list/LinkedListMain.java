package linked_list;

public class LinkedListMain {
    public static void main(String[] args) {
        
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();

        integerLinkedList.addNode(56);
        integerLinkedList.addNode(70);

        integerLinkedList.display();
        integerLinkedList.insertAt(1, 30);
        integerLinkedList.display();

        integerLinkedList.popLast();
        integerLinkedList.display();

        integerLinkedList.popLast();
        integerLinkedList.display();
        
    }
}