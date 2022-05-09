import java.util.Scanner;
 
class TwoStacksInAnArray{
    public static Scanner sc = new Scanner(System.in);
    private static int size1;
    private static int size2;
    private static int[] stack;
    private static int top1 = -1;
    private static int top2;


    public static void main(String[] args){
        System.out.print("Enter the number of elements in stack 1 : ");
        size1 = sc.nextInt();
        System.out.print("Enter the number of elements in stack 2 : ");
        size2 = sc.nextInt();
        top2 = size1 - 1;
        stack = new int[size1 + size2];

        while(true){
            System.out.println("\n1. stack1  2. stack2 3. exit\n");
            System.out.print("Enter your choice : ");
            int stackChoice = sc.nextInt();
            if(stackChoice == 3){
                break;
            }
            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            System.out.println();

            switch(stackChoice){
                case 1 : 
                    switch(choice){
                        case 1:
                            push1();
                            break;
                        case 2:
                            pop1();
                            break;
                        case 3:
                            display1();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid choice\n");
                    }
                    break;

                case 2 :
                    switch(choice){
                        case 1:
                            push2();
                            break;
                        case 2:
                            pop2();
                            break;
                        case 3:
                            display2();
                            break;
                        case 4:
                            break;
                        default:    
                            System.out.println("Invalid choice");
                    }
                    break;
                    
                default:
                    System.out.println("Invalid choice\n");
            }
        }

    }

    public static void push1(){
        System.out.print("Enter the element to be pushed : ");
        int element = sc.nextInt();

        if(top1 == size1 - 1){
            System.out.println("Stack 1 is full\n");
            return;
        }
        stack[++top1] = element;
        System.out.println("Element pushed successfully into stack 1\n");
    }

    public static void push2(){
        System.out.print("Enter the element to be pushed : ");
        int element = sc.nextInt();

        if(top2 == stack.length - 1){
            System.out.println("Stack 2 is full\n");
            return;
        }

        stack[++top2] = element;
        System.out.println("Element pushed successfully into stack 2\n");
    }

    public static void pop1(){
        if(top1 == -1){
            System.out.println("Stack 1 is empty\n");
            return;
        }
        System.out.println("Element popped from stack 1 is : " + stack[top1--]);
    }

    public static void pop2(){
        if(top2 == size1){
            System.out.println("Stack 2 is empty\n");
            return;
        }
        System.out.println("Element popped from stack 2 is : " + stack[top2--]);
    }

    public static void display1(){
        if(top1 == -1){
            System.out.println("Stack 1 is empty\n");
            return;
        }
        System.out.println("Stack 1 elements are : ");

        for(int i = top1; i >= 0; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void display2(){
        if(top2 == size1){
            System.out.println("Stack 2 is empty\n");
            return;
        }

        System.out.println("Stack 2 elements are : ");

        for(int i = top2; i >= size1; i--){
            System.out.print(stack[i] + " ");
        }

        System.out.println();

    }
}