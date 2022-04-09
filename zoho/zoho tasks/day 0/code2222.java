import java.util.Scanner;

class code2222{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] array = {1,2,3,4,5};
        for(int i = 0; i < n; i++){
            printArray(array, 5);
            shift(array, 5);
        }
    }

    public static void shift(int[] array, int n){
        int temp = array[0];
        for(int i = 0; i < n-1; i++){
            array[i] = array[i+1];
        }
        array[n-1] = temp;
    }

    public static void printArray(int[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}