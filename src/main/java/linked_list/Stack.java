package linked_list;

import java.util.ArrayList;

public class Stack<T> {
    private final LinkedList<T> myLinkedList;

    Stack(){
        myLinkedList = new LinkedList<T>();
    }

    public void push(T value){
        myLinkedList.insertAt(0, value);
    }

    public T peek(){
        if(myLinkedList.head == null){
            System.out.println("Stack is empty");
            return null;
        }else{
            return myLinkedList.head.data;
        }
    } 
    
    public T pop(){
        if(myLinkedList.head == null){
            System.out.println("Stack is empty");
            return null;
        }else{
            Node<T> prevHead = myLinkedList.head;
            myLinkedList.head = myLinkedList.head.next;
            prevHead.next = null;
            return prevHead.data;
        }
    } 

    boolean isEmpty(){
        return (myLinkedList.size() == 0);
    }

    int stackSize(){
        return myLinkedList.size();
    }

}
