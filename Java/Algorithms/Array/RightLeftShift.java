import java.util.Scanner;

class RightLeftShift{
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
        for(int i = 0; i < num; i++){
            RightShift(array, n);
        }
    }

    public static void RightShift(int[] array, int n){
        int elem = array[0];
        for(int i = 0; i < n - 1; i++){
            int temp = array[i + 1];
            array[i + 1] = elem;
            elem = temp;
        }
        array[0] = elem;
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

// O(n^2) algorithm