import java.util.Scanner;
 
class QuickSort{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] array = getArray();

        quickSort(array, 0, array.length - 1);

        printArray(array);
    }

    public static void quickSort(int[] array, int start, int end){
        if(start < end){
            int pIndex = partition(array, start, end);
            quickSort(array, start, pIndex - 1);
            quickSort(array, pIndex + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end){
        int pIndex = start;
        int pivot = array[end];

        for(int i = start; i < end; i++){
            if(array[i] < pivot){
                swap(array, i, pIndex);
                pIndex++;
            }
        }

        swap(array, pIndex, end);
        return pIndex;
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] getArray(){
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        return array;
    }   

    public static void printArray(int[] array){
        System.out.println();
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

