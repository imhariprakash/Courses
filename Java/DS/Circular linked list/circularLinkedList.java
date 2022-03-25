class Node{
    int data;
    Node next;
}

public class circularLinkedList{
    public static void main(String[] args){
        Node head = new Node();
        Node middle = new Node();
        Node tail = new Node();

        head.data = 10;
        middle.data = 20;
        tail.data = 30;

        head.next = middle;
        middle.next = tail;
        tail.next = head;

        printCircularLL(head);
    }

    public static void printCircularLL(Node head){
        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp != head);
    }
}