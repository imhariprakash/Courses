import java.util.Scanner;

class Bsearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        getArray(array);
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        binSearch(array, key);
    }

    public static void binSearch(int[] array, int key){
        int start = 0, stop = array.length - 1, mid;
        while(start <= stop){
            mid = (start + stop)/2;
            if(array[mid] == key){
                System.out.println("Key found at index " + mid);
                return;
            }
            else if(array[mid] > key){
                stop = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println("Key not found.");
    }

    public static void getArray(int[] array){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter element " + (i + 1) + " : " + array[i]);
        }
    }
}