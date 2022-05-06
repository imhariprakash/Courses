class Node{
    int data;
    Node next;
    Node prev;
}

class CircularLinkedList_AddLast{
    public static void main(String[] args){
        Node head, tail, elem1, elem2, elem3;

        elem1 = new Node();
        elem2 = new Node();
        elem3 = new Node();

        elem1.data = 1;
        elem2.data = 2;
        elem3.data = 3;

        elem1.next = elem2;
        elem2.next = elem3;
        elem3.next = elem1;

        elem1.prev = elem3;
        elem2.prev = elem1;
        elem3.prev = elem2;

        head = elem1;
        tail = elem3;

        tail = addLast(head, tail, 0);
        tail = addLast(head, tail, 9);

        printStraight(head);
        printReverse(tail);

        

    }

    public static Node addLast(Node head, Node tail, int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        newNode.prev = tail;

        tail.next = newNode;
        head.prev = newNode;
        return(newNode);
    }

    public static Node addFirst(Node head, Node tail, int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        newNode.prev = tail;

        head.prev = newNode;
        tail.next = newNode;

        return(newNode);

    }

    public static void printStraight(Node head){
        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp != head);

        System.out.println();
    }

    public static void printReverse(Node tail){
        Node temp = tail;
        do{
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }while(temp != tail);

        System.out.println();
    }
}