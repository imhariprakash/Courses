import java.util.Scanner;

class Node{
    int data;
    Node next;
}

class Search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("1. Add 2. Print 3. Delete 4. Search 5. Exit");
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
                System.out.print("Enter the key to delete : ");
                int value = sc.nextInt();
                head = deleteKey(head, value);
            }
            else if(choice == 4){
                System.out.print("Enter the key to search : ");
                int value = sc.nextInt();
                if(search(head, value)){
                    System.out.println("Found");
                }
                else{
                    System.out.println("Not found");
                }
            }
            else if(choice == 5){
                break;
            }
        }while(true);
        sc.close();
    }

    public static boolean search(Node head, int value){
        Node temp = head;
        while(temp != null){
            if(temp.data == value){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static Node deleteKey(Node head, int value){
        if(head == null){
            System.out.println("Empty");
            return(head);
        }
        else if(head.data == value){
            return(head.next);
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == value){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        System.out.println("Element not found");
        return(head);
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