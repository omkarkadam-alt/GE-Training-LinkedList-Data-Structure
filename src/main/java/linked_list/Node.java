package linked_list;

public class Node <T>{
    public T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        this.next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

