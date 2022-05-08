import java.util.Scanner;
 
class BubbleSort_modified{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int[] array = getArray();

        bubbleSort(array);

        printArray(array);
    }

    public static void bubbleSort(int[] array){
        for(int i = 0; i < array.length; i++){
            boolean flag = false;
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    swap(array, j, j + 1);
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }

    public static void printArray(int[] array){
        System.out.println();
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] getArray(){
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}