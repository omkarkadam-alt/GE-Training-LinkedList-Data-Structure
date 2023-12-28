package linked_list;

public class LinkedListMain {
    public static void main(String[] args) {

        Queue<Integer> myQueue = new Queue<Integer>();

        myQueue.enqueue(56);
        myQueue.enqueue(30);
        myQueue.enqueue(70);

        Integer front1 = myQueue.front();
        if(front1 != null)
            System.out.println(front1);

        myQueue.dequeue();
        Integer front2 = myQueue.front();
        if(front2 != null)
            System.out.println(front2);

    }
}