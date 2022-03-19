import java.util.Scanner;

class LinkedList{
    int data;
    LinkedList next;
}

class AddElementAtFirst{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList head = null;

        System.out.println("1. Add 2. Print -1. Exit");

        do{
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter value : ");
                int value = sc.nextInt();
                head = AddFirst(head, value);
            }
            else if(choice == 2){
                printList(head);
            }
            else if(choice == -1){
                break;
            }
        }while(true);

        sc.close();
    }

    public static LinkedList  AddFirst(LinkedList head, int value){
        LinkedList temp = new LinkedList();
        temp.data = value;
        temp.next = head;
        return(temp);
    }

    public static void printList(LinkedList head){
        LinkedList temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}