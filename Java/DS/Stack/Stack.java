import java.util.Scanner;
 
class Stack{
    public static Scanner sc = new Scanner(System.in);

    private static int top = -1;

    public static void main(String[] args){
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();

        int[] stack = new int[size];

        while(true){
            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    push(stack);
                    break;
                case 2:
                    pop(stack);
                    break;
                case 3:
                    display(stack);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void push(int[] stack){
        System.out.print("Enter the element to be pushed: ");
        int element = sc.nextInt();

        if(top == stack.length - 1){
            System.out.println("Stack is full");
            return;
        }

        stack[++top] = element;
        System.out.println("Element pushed successfully");
    }

    public static void pop(int[] stack){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Element popped is: " + stack[top--]);
    }

    public static void display(int[] stack){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }   

        System.out.println("Stack elements are: ");

        for(int i = top; i >= 0; i--){
            System.out.print(stack[i] + " ");
        }
    }        
}