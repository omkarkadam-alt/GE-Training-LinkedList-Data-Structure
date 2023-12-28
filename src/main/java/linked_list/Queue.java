package linked_list;

import java.util.ArrayList;

public class Queue<T> {

    private final LinkedList<T> myLinkedList;

    Queue(){
        myLinkedList = new LinkedList<T>();
    }

    public void enqueue(T value){
        myLinkedList.addNode(value);
    }

    public T front(){
        if(myLinkedList.head == null){
            System.out.println("Queue is empty");
            return null;
        }else{
            return myLinkedList.head.data;
        }
    }
    
    public T dequeue(){
        if(myLinkedList.head == null){
            System.out.println("Queue is empty");
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

    int queueSize(){
        return myLinkedList.size();
    }

}

