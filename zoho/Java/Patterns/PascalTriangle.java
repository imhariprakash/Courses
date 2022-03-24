import java.util.Scanner;

class PascalTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        factArray(array, n - 1);
        pascal(array, n);
        sc.close();
    }

    public static void pascal(int[] array, int n) {
        for(int row = 0; row < n; row++){
            for(int col = 0; col <= row; col++){
                System.out.print((array[row] / (array[col] * array[row - col])) + " ");
            }
            System.out.println();
        }
    }

    public static void factArray(int[] array, int n){
        array[0] = 1;
        int temp = 1;
        for(int i = 1; i <= n; i++){
            temp *= i;
            array[i] = temp;
        }
    }

    public static void printArray(int[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }

}