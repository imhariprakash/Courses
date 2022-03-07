import java.util.Scanner;

class RightLeftShiftWrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        getArray(array, n);
        System.out.println("+ ve for right shift and -ve for left shift.");
        System.out.print("\nEnter number of shifts : ");
        int num = sc.nextInt();
        if(num != 0){
            num = getShift(num, n);
            shiftArray(array, n, num);
        }
        printArray(array, n);
        sc.close();
    }

    public static void shiftArray(int[] array, int n, int num){
        int elem = array[0], temp;
        if(n % 2 != 0){
            for(int i = 0; i < n; i++){
                temp = array[(num * (i + 1)) % n];
                array[(num * (i + 1)) % n] = elem;
                elem = temp;
            }
        }
        else{
            for(int i = 0; i < n; i++){
                printArray(array, n);
                int s = ((num * (i + 1)) - ((num * (i + 1)) / n)) % n;
                temp = array[s];
                array[s] = elem;
                elem = temp;
            }
        }
    }

    public static int getShift(int num, int size){
        if(num < 0){
            num = size + -((-num) % size);
        }
        return num;
    }

    public static void getArray(int[] array, int n){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Enter element "+ (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
