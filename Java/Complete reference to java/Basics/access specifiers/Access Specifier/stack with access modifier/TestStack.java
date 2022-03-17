import java.util.Scanner;
class TestStack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int choice;
        System.out.println("\n1. Push 2. Pop 3. Exit\n");
        do{
            System.out.print("Enter choice : ");
            choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter the number : ");
                int num = sc.nextInt();
                stack.push(num);
            }
            else if(choice == 2){
                stack.pop();
            }
            else if(choice == 3){
                break;
            }
            else{
                System.out.println("Wrong choice\n");
            }
        }while(true);
    }
}