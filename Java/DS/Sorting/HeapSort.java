import java.util.Scanner;
 
class HeapSort{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] array = getArray();
        int size = array.length - 1;
        
        buildHeap(array, size);    // buildHeap takes O(n) time and O(1) space , heapify takes O(log n) time and O(1) space - totally nlogn time and O(1) space complexity

        heapSort(array, size);

        printArray(array);

    }

    public static void heapSort(int[] array, int size){
        for(int i = size; i > 0; i--){
            swap(array, 0, i);
            size--;
            heapify(array, 0, size);
        }
    }

    public static int[] getArray(){
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        return array;
    }


    public static void buildHeap(int[] array, int size){

        int i;

        if(size % 2 != 0){
            i = size / 2 - 1;
        }
        else{
            i = size / 2;
        }


        for(; i >= 0; i--){
            heapify(array, i, size);
        }
    }

    public static int deleteMax(int[] array, int size){
        swap(array, 0, size);
        size--;
        heapify(array, 0, size);
        return size;
    }

    public static void heapify(int[] array, int i, int size){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;

        if(left <= size && array[i] < array[left]){
            max = left;
        }
        if(right <= size && array[max] < array[right]){
            max = right;
        }

        if(max != i){
            swap(array, i, max);
            heapify(array, max, size);
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void print(int[] array, int size){
        for(int i = 0; i <= size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] array){
        System.out.println();
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}