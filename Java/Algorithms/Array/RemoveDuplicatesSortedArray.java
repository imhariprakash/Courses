import java.util.Scanner;

class RemoveDuplicatesSortedArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for elements : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        getArray(array, n);
        n = RemoveDuplicates(array, n);
        printArray(array, n);
        sc.close();
    }

    public static int RemoveDuplicates(int[] array, int n){
        int start = 0,i;
        for(i = 0; i < n - 1; i++){
            if(array[i] != array[i + 1]){
                array[start++] = array[i];
            }
        }
        array[start++] = array[i];
        System.out.println(start);
        return(start);
    }

    public static void getArray(int[] array, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println();
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