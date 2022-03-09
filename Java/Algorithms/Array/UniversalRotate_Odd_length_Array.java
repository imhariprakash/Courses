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
        if(num != 0){
            rightShift(array, n, num);
        }
        printArray(array, n);
    }

    public static void rightShift(int[] array, int n, int num){
        int count = 0, elem = array[0], temp;

        for(int i = num, start= 0; count != n;){
            temp = array[i];
            array[i] = elem;
            if(start == i){
                start++;
                i = start + num;
                elem = array[start];
            }
            else{
                i = (i + num) % n;
                elem = temp;
            }
            count++;
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

//  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45

//  1 2 3 4 5 6 7 8 9 10 11


// problem : leet code - slow