import java.util.Scanner;
 
class InsertionSort{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] array = getArray();
        insertionSort(array);
        printArray(array);
    }

    public static int[] getArray(){
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int j = i - 1;
            int temp = array[i];
            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}