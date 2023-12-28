package linked_list;

public class LinkedListMain {
    public static void main(String[] args) {
        
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();

        integerLinkedList.addNode(56);
        integerLinkedList.addNode(70);

        integerLinkedList.display();
        integerLinkedList.insertAt(1, 30);
        integerLinkedList.display();

        Node<Integer> search1 = integerLinkedList.search(50);
        if(search1 == null){
            System.out.println("Node with value " + 50 + " was not found");
        }else{
            System.out.println("Node with value " + 50 + " found");
        }

        Node<Integer> search2 = integerLinkedList.search(56);
        if(search2 == null){
            System.out.println("Node with value " + 56 + " was not found");
        }else{
            System.out.println("Node with value " + 56 + " found");
        }
        
    }
}