class Node{
    int data;
    Node next;
}


class Reverse{
    public static void main(String[] args){
        Node head = new Node();
        Node head1 = new Node();
        Node head2 = new Node();
        Node head3 = new Node();
        Node head4 = new Node();
        Node head5 = new Node();

        head.data = 1;
        head1.data = 2;
        head2.data = 3;
        head3.data = 4;                                      
        head4.data = 5;
        head5.data = 6;

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = null;

        head = reverse(head);
        printList(head);
    }

    public static Node reverse(Node head){
        Node temp = head;
        Node prev = null;
        Node hold;
        while(temp != null){
            hold = temp.next;
            temp.next = prev;
            prev = temp;
            temp = hold;
        }
        return prev;
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}



/* 

Node head = new Node();
        Node head1 = new Node();
        Node head2 = new Node();
        Node head3 = new Node();
        Node head4 = new Node();
        Node head5 = new Node();
        Node head6 = new Node();

        head.data = 1;
        head1.data = 2;
        head2.data = 3;
        head3.data = 4;
        head4.data = 5;
        head5.data = 6;
        head6.data = 7;

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = null;

*/