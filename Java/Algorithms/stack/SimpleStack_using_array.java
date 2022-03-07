import java.util.Scanner;
class SimpleStack_using_array{

    public static int MAX = 10;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 : Push, Enter 2 : Pop");
        System.out.print("Enter yout choice :");
        int count = 0, choice = 0;
        int [] array = new int[MAX];
        System.out.println("1. Push 2. Pop -1. Exit\n");
        while(choice != -1){
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1 : 
                    if(push(array, count)){
                        count++;
                    }
                    break;
                case 2 : 
                    if(pop(array, count)){
                        count--; 
                    }
                    break;
                case -1 : 
                    printArray(array, count);
                    return;
                default : 
                    System.out.println("1. Push 2. Pop -1. Exit\n");
                    
            }
        }
    }

    public static boolean push(int[] array, int count){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number : ");
        int num = sc.nextInt();
        if(count == MAX){
            System.out.println("Stack overflow.");
            return false;
        }
        else{
            array[count] = num;
        }
        return true;
    }

    public static boolean pop(int[] array, int count){
        if(count == 0){
            System.out.println("Empty stack.");
            return false;
        }
        else{
            System.out.println(array[count - 1]);
            array[count - 1] = 0;
        }
        return true;
    }

    public static void printArray(int[] array, int count){
        for(int i = 0; i < count; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}