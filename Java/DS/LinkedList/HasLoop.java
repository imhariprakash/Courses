class Node{
    int data;
    Node next;
}

class HasLoop{
    public static void main(String[] args){
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
        head6.next = head6;

        if(isLoop(head)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static boolean isLoop(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}

/*----------------------------------------------------------------

Node head = null;
        if(isLoop(head)){
            System.out.println("Yes");
        }
        else{                                                 ----------------------> Noooooo
            System.out.println("No");
        }


Node head = new Node();
        Node head1 = new Node();
        Node head2 = new Node();
        Node head3 = new Node();
        Node head4 = new Node();
        Node head5 = new Node();

        head.data = 1;
        head1.data = 2;
        head2.data = 3;
        head3.data = 4;                                      ----------------------->   NOOOOOOOOOOOOOOOOOOO
        head4.data = 5;
        head5.data = 6;

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = null;

        if(isLoop(head)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

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
        head5.data = 6;                           ------------------------------------------->  Yesssssssssssssssssssssssssssss

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head2;

        if(isLoop(head)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    

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
        head1.next = head2;                         --------------------------------------------->  Yesssssssssssssssssssssssssssssssss
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head6;

        if(isLoop(head)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

-------------------------------------------------------------------*/