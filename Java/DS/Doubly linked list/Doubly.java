class Node{
    Node prev;
    int data;
    Node next;
}

class Doubly{
    public static void main(String[] args){
        Node head = new Node();
        Node middle = new Node();
        Node tail = new Node();

        head.prev = null;
        middle.prev = head;
        tail.prev = middle;

        head.next = middle;
        middle.next = tail;
        tail.next = null;

        head.data = 10;
        middle.data = 20;
        tail.data = 30;

        printList(head);
        revPrintList(tail);
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void revPrintList(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}