import java.util.Scanner;
 
class BinarySearch{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] array = getArray();

        System.out.print("Enter the number to be searched : ");
        int key = sc.nextInt();

        int index = binarySearch(array, 0, array.length - 1, key);

        if(index == -1){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Number found at index : " + index);
        }
    }

    public static int binarySearch(int[] array, int start, int end, int key){
        if(start > end){
            return -1;
        }

        int mid = (start + end)/2;

        if(array[mid] == key){
            return mid;
        }
        else if(array[mid] > key){
            return binarySearch(array, start, mid-1, key);
        }
        else{
            return binarySearch(array, mid+1, end, key);
        }
    }

    public static int[] getArray(){
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }
}