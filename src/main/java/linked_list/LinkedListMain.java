package linked_list;

public class LinkedListMain {
    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<Integer>();

        myStack.push(56);
        myStack.push(30);
        myStack.push(70);
        Integer peek1 = myStack.peek();
        if(peek1 != null)
            System.out.println(peek1);

        myStack.pop();
        Integer peek2 = myStack.peek();
        if(peek2 != null)
            System.out.println(peek2);

    }
}