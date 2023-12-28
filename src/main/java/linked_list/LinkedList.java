package linked_list;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList(){
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

    int size(){
        int numberOfNodes = 0;
        Node<T> temp = head;
        while(temp != null){
            numberOfNodes++;
            temp = temp.next;
        }

        return numberOfNodes;
    }

    void insertAt(int position, T data){

        if(size() == 0){
            if(position != 0){
                System.out.println("Invalid Position.");
                System.out.println();
            }else{
                head = new Node<T> (data);
            }
        }
        if(position < 0 || position >= size())
        {
            System.out.println("Invalid Position.");
            System.out.println();
        } else{
            Node <T> newNode = new Node<T>(data);
            if(position == 0){
                newNode.next = head;
                head = newNode;
            } else{
                Node <T> prev = head;
                for(int currIndex = 0; currIndex < position - 1; currIndex++){
                    prev = prev.next;
                }
                newNode.next = prev.next;
                prev.next = newNode;
            }
        }
    }

    Node pop(){
        if(head == null){
            return null;
        }

        Node<T> temp = head;
        head = head.next;
        temp.next = null;
        
        return temp;
    }

    Node popLast(){
        if(head == null){
            return null;
        }

        if(head.next == null)
        {
            Node<T> temp = head;
            head = null;
            return temp;
        }

        Node<T> temp = head;
        while(temp.next.next != null)
            temp = temp.next;
        
        Node<T> lastNode = temp.next;
        temp.next = null;
        return lastNode;

    }

    Node search(T key){
        Node<T> temp = head;

        while(temp != null){
            if(temp.data == key)
                return temp;
            temp = temp.next;
        }

        return null;
    }

    void deleteKey(T key){

        Node<T> searchResult = search(key);
        if(searchResult == null){
            System.out.println("Node not found.");
            System.out.println("Size of linked list is: " + size());
            return;
        }

        Node<T> temp = head;
        if(head.data == key){
            pop();
            return;
        }else{
            if(head.next != null && head.next.data == key){
                Node<T> temp2 = head;
                head = head.next;
                temp2.next = null;
            }
            else{
                while(temp.next.data != key){
                    temp = temp.next;
                }

                Node<T> targetNode = temp.next;
                temp.next = temp.next.next;
                targetNode.next = null;
            }
        }

        System.out.println("Node deleted.");
        System.out.println("Size of linked list is: " + size());
        return;
    }


}
