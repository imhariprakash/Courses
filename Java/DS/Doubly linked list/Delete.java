import java.util.Scanner;

class Node{
    Node prev;
    int data;
    Node next;
}

class Delete{
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

        do{
            System.out.print("Enter key : ");
            int key = sc.nextInt();
            if(key == -1)
                break;
            else if(head == null && tail == null){
                System.out.println("Empty");
                break;
            }
            else if(head.next == null){
                head = tail = null;
                break;
            }
            else if(head.data == key){
                head = head.next;
                head.prev = null;
            }
            else if(tail.data == key){
                tail = tail.prev;
                tail.next = null;
            }
            else{
                head = delete(head, key);
            }
            printList(head);
            revPrintList(tail);
        }while(true);


        sc.close();
    }

    public static Node delete(Node head, int key){
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == key){
                temp.next.next.prev = temp;
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        System.out.println("Key not found.");
        return head;
    }

    public static void search(Node head, int key){
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                System.out.print("Found\n");
                return;
            }
            temp = temp.next;
        }
        System.out.print("Not found\n");
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


// 1 1 1 2 1 3 1 4 1 5 1 6 1 7 1 8 1 9 1 10