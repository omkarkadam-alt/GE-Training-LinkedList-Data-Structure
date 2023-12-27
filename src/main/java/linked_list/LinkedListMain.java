package linked_list;

public class LinkedListMain {
    public static void main(String[] args) {
        
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);

        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
    }
}