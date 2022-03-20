import java.util.Scanner;

class Node{
    int data;
    Node next;
}

class SlowAndFast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("1. Add 2. Print 3. Exit");
        do{
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter value : ");
                int value = sc.nextInt();
                head = AddLastEle(head, value);
            }
            else if(choice == 2){
                printList(head);
            }
            else if(choice == 3){
                break;
            }
        }while(true);

        getMiddle(head);
        sc.close();
    }

    public static void getMiddle(Node head){
        Node fast = head;
        Node slow = head;
        if(head == null){
            return;
        }

        while(fast != null){
            if(fast.next == null){
                break;
            }
            else if(fast.next.next == null){
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        
        System.out.println(slow.data);
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node AddLastEle(Node head, int value){
        Node temp = new Node();
        temp.data = value;
        temp.next = null;
        if(head == null){
            return temp;
        }
        Node traverse = head;
        while(traverse.next != null){
            traverse = traverse.next;
        }
        traverse.next = temp;
        return head;
    }
}