import java.util.Scanner;

class Node{
    int data;
    Node next;
}
 
class StackUsingLinkedList{
    public static Scanner sc = new Scanner(System.in);

    private static int top = -1;
    private static Node head = null;

    public static void main(String[] args){

        while(true){
            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void push(){
        System.out.print("Enter the element to be pushed: ");
        int data = sc.nextInt();

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;


        ++top;

        System.out.println("Element pushed successfully\n");
    }

    public static void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Popped element is: " + head.data + "\n");

        head = head.next;

        top--;
    }

    public static void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }   

        System.out.println("Stack elements are: ");

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }        
}