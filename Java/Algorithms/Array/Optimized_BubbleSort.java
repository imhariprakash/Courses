import java.util.Scanner;
 
class Optimized_BubbleSort{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){ 
        int[] array = getArray();
        int count = 0;
        //boolean swapped = false; // no use here -> already sorted or not -> if sorted at 1 st interation or inbetween still need to complete all iterations
        for(int times = 1; times < array.length; times++){
            boolean swapped = false;  // flag every time here saves time than declaring in top -> 5 1 2 3 4 -> sorted after 1 st iteration - > second iteration no swap
            for(int j = 0; j < array.length - times; j++){
                count++;
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }                
            }
            if(!swapped){
                break;
            }
        }

        printArray(array);
        System.out.println("\nTotal number of steps: " + count);
    }

    public static int[] getArray(){
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < size; i++){
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