import java.util.Scanner;

class Node{
    int data;
    Node next;
}

class ReverseGetNode{
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
        int n = getCount(head);
        do{
            System.out.print("Enter the index : ");
            int index = sc.nextInt();
            if(index == -1){
                break;
            }
            revGetNode(head, n - index);
        }while(true);
        sc.close();
    }

    public static int getCount(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++; 
            temp = temp.next;
        }
        return count;
    }

    public static void printReverse(Node head) {
        if(head == null){
            return;
        }
        else{
            printReverse(head.next);
            System.out.print(head.data + " ");
        }
    }

    public static void revGetNode(Node head, int index){
        Node temp = head;
        int count = 0;
        while(temp != null){
            if(count == index){
                System.out.println(temp.data);
                return;
            }
            temp = temp.next;
            count++;
        }
        System.out.println("Not found.");
        return;
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