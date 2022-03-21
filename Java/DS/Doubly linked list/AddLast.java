import java.util.Scanner;

class Node{
    Node prev;
    int data;
    Node next;
}

class AddLast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node head = null, tail = null;
        System.out.println("1. add 2. display 3. exit");
        do{
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter value : ");
                int value = sc.nextInt();
                if(head == null){
                    tail = addLast(tail, value);
                    head = tail;
                }
                else
                    tail = addLast(tail, value);
            }
            else if(choice == 2){
                printList(head);
                revPrintList(tail);
            }
            else if(choice == 3){
                break;
            }
        }while(true);
        sc.close();
    }

    public static Node addFirst(Node head, int value){
        Node temp = new Node();
        temp.data = value;
        if(head == null){
            temp.prev = null;
            temp.next = null;
        }
        else{
            temp.prev = null;
            temp.next = head;
            head.prev = temp;
        }
        return temp;
    }

    public static Node addLast(Node tail, int value){
        Node temp = new Node();
        temp.data = value;
        temp.next = null;
        if(tail == null){
            temp.prev = null;
        }
        else{
            temp.prev = tail;
            tail.next = temp;
        }
        return temp;
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