import java.util.Scanner;
class ReversalMethodArrayRotation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        getArray(array, n);
        System.out.print("How many rotations ? : ");
        int k = sc.nextInt();
        reverse(array, 0, n - k - 1);
        reverse(array, n - k, n - 1);
        reverse(array, 0, n - 1);
        printArray(array, n);
        sc.close();
    }

    public static void reverse(int[] array, int start, int end){
        for(int i = start; i <= (end + start) / 2; i++){
            int temp = array[i]; 
            array[i] = array[end + start - i];
            array[end + start - i] = temp;
        }
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