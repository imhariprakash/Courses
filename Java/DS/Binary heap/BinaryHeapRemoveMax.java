import java.util.Scanner;
 
class BinaryHeapRemoveMax{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] array = {10,20,40,30,80,60,50};
        int i, size = array.length - 1;

        if(size % 2 != 0){
            i = size / 2 - 1;
        }
        else{
            i = size / 2;
        }


        for(; i >= 0; i--){
            heapify(array, i, size);
        }

        print(array, size);
        size = deleteMax(array, size);
        print(array, size);
        size = deleteMax(array, size);
        print(array, size);

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
}