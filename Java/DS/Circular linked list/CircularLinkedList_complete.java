import java.util.Scanner;

class Node{
    public int data;
    public Node next;
    public Node prev;
}
 
class CircularLinkedList{
    public static Scanner sc = new Scanner(System.in);
    public static Node head = null;
    public static Node tail = null;
    public static int size = 0;

    public static void main(String[] args){
        System.out.println("1. Insert at the beginning   2. Insert at the end   3. Insert at a given position\n4. Delete at the beginning   5. Delete at the end   6. Delete at a given position\n7. Delete a particular node(first instance)         8. Delete a particular data(all instances)\n9. Display   10. Display in reverse   11. Search  12. Reverse  13. sort  14. Exit");
        
        while(true){
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 14:
                    return;
                case 1:
                    insertAtBeginning();
                    break;
                case 2:
                    insertAtEnd();
                    break;
                case 3:
                    insertAtPosition();
                    break;
                case 4:
                    deleteAtBeginning();
                    break;
                case 5:
                    deleteAtEnd();
                    break;
                case 6:
                    deleteAtPosition();
                    break;
                case 7:
                    deleteFirstInstance();
                    break;
                case 8:
                    deleteAllInstances();
                    break;
                case 9:
                    display();
                    break;
                case 10:
                    displayReverse();
                    break;
                case 11:
                    search();
                    break;
                case 12:
                    reverse();  
                    break;
                case 13:
                    sort();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void insertAtBeginning(){
        System.out.print("Enter the data: ");
        int data = sc.nextInt();

        Node newNode = new Node();
        newNode.data = data;

        if(head == null){
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        newNode.prev = tail;

        head.prev = newNode;
        tail.next = newNode;

        head = newNode;
        size++;
    }

    public static void insertAtEnd(){
        System.out.print("Enter the data: ");
        int data = sc.nextInt();

        Node newNode = new Node();
        newNode.data = data;

        if(tail == null){
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        newNode.prev = tail;

        tail.next = newNode;
        head.prev = newNode;

        tail = newNode;
        size++;
    }

    public static void insertAtPosition(){

        System.out.print("Enter the position: ");
        int position = sc.nextInt();

        if(position > size + 1 || position < 1){
            System.out.println("Invalid position");
            return;
        }

        if(head == null || position == 1){
            insertAtBeginning();
            return;
        }

        if(position == size + 1){
            insertAtEnd();
            return;
        }

        insertAtIndex(position);
    }

    public static void insertAtIndex(int position){
        System.out.print("Enter the data: ");
        int data = sc.nextInt();

        Node newNode = new Node();
        newNode.data = data;

        Node current = head;
        int index = 1;

        while(index < position - 1){
            current = current.next;
            index++;
        }

        newNode.next = current.next;
        newNode.prev = current;

        current.next.prev = newNode;
        current.next = newNode;

        size++;
    }

    public static void deleteAtBeginning(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(size == 1){
            head = null;
            tail = null;
            size--;
            return;
        }

        head = head.next;
        head.prev = tail;
        tail.next = head;
        size--;
    }

    public static void deleteAtEnd(){
        if(tail == null){
            System.out.println("List is empty");
            return;
        }
        if(size == 1){
            head = null;
            tail = null;
            size--;
            return;
        }

        tail = tail.prev;
        tail.next = head;
        head.prev = tail;
        size--;
    }

    public static void deleteAtPosition(){
        System.out.print("Enter the position: ");
        int position = sc.nextInt();

        if(position > size || position < 1){
            System.out.println("Invalid position");
            return;
        }

        if(head == null || position == 1){
            deleteAtBeginning();
            return;
        }

        if(position == size){
            deleteAtEnd();
            return;
        }

        deleteAtIndex(position);
    }

    public static void deleteAtIndex(int position){
        Node current = head;
        int index = 1;

        while(index < position - 1){
            current = current.next;
            index++;
        }

        current.next = current.next.next;
        current.next.prev = current;
        size--;
    }

    public static void deleteFirstInstance(){
        System.out.print("Enter the data: ");
        int data = sc.nextInt();

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.data == data){
            deleteAtBeginning();
            return;
        }

        if(tail.data == data){
            deleteAtEnd();
            return;
        }

        deleteAtIndex(search(data)); // no need for head.data == data and tail.data == data -> since we are searching !
    }

    public static void deleteAllInstances(){
        System.out.print("Enter the data: ");
        int data = sc.nextInt();

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        int index = 1;

        do{
            if(current.data == data){
                deleteAtIndex(index);
            }
            current = current.next;
            index++;
        }while(current != head);
    }

    public static void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp != head);

        System.out.println();
    }

    public static void displayReverse(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = tail;

        do{
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }while(temp != tail);

        System.out.println();
    }

    public static void search(){
        System.out.print("Enter the data: ");
        int data = sc.nextInt();

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        int index = 1;

        Node temp = head;

        do{
            if(temp.data == data){
                System.out.println("Data found at index " + index);
                return;
            }
            index++;
            temp = temp.next;
        }while(temp != head);

        System.out.println("Data not found");
    }

    public static int search(int data){
        if(head == null){
            return(-1);
        }

        int index = 1;

        Node temp = head;

        do{
            if(temp.data == data){
                return(index);
            }
            index++;
            temp = temp.next;
        }while(temp != head);

        return(-1);
    }

    public static void reverse(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        do{
            Node temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        }while(current != head);

        Node temp = head;
        head = tail;
        tail = temp;
    }

    public static void sort(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        for(int i = 0; i < size - 1; i++){
            Node temp = current.next;
            for(int j = i + 1; j < size; j++){
                if(current.data > temp.data){
                    int tempVar = temp.data;
                    temp.data = current.data;
                    current.data = tempVar;
                }
                temp = temp.next;
            }

            current = current.next;
        }
    }
}