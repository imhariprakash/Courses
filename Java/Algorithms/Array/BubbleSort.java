import java.util.Scanner;
 
class BubbleSort{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){ 
        int[] array = getArray();

        for(int times = 1; times < array.length; times++){
            for(int j = 0; j < array.length - times; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                
            }
        }

        printArray(array);
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