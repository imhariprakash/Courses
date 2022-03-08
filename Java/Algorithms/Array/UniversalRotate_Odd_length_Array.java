import java.util.Scanner;

class UniversalRotate_Odd_length_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        getArray(array, n);
        System.out.println("\n1. +ve to right shift 2. -ve shift");
        System.out.print("Enter how many times to shift : ");
        int num = sc.nextInt();
        num = getShift(n, num);
        if(n != 0){
            rightShift(array, n, num);
        }
        printArray(array, n);
    }

    public static void rightShift(int[] array, int n, int num){
        int count = 0, elem = array[0];
        if(n % 2 != 0){
            for(int i = 0; count != n; i = ((i + num) % n)){
                int temp = array[(i + num) % n];
                array[(i + num) % n] = elem;
                elem = temp;
                count++;
            }
        }
    }

    public static int getShift(int size, int n){
        if(n < 0){
            n = size + (-((-n) % size));
        }
        else{
            n = n % size;
        }
        return n;
    }

    public static void getArray(int[] array, int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}