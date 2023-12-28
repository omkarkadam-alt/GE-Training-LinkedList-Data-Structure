package linked_list;

public class Stack<T> {
    private final LinkedList<T> myLinkedList;

    Stack(){
        myLinkedList = new LinkedList<T>();
    }

    public void push(T value){
        myLinkedList.addNode(value);
    }
}
