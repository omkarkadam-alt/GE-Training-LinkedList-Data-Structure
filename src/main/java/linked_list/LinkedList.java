package linked_list;

public class LinkedList<T> {
    Node<T> head;

    LinkedList(){
        this.head = null;
    }

    void addNode(T data){
        Node <T> newNode = new Node<T>(data);
        if(head == null){
            head = newNode;
        }else{
            Node<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display(){
        Node<T> temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
