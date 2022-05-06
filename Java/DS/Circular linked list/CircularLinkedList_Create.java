class Node{
    int data;
    Node next;
    Node prev;
}

class CircularLinkedList_Create{
    public static void main(String[] args){
        Node head, tail, elem1, elem2, elem3, temp;

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

        temp = head;

        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp != head);

        System.out.println();

        temp = tail;

        do{
            System.out.print(tail.data + " ");
            tail = tail.prev;
        }while(tail != temp);

    }
}