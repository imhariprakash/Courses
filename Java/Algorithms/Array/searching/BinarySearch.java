import java.util.Scanner;

class BinarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        getArray(array, n); 
        int index = bsearch(array, n);   
        if(index == -1){
            System.out.println("Key not found.");
        }
        else{
            System.out.println("Key found at index " + index + ".");
        }
    }

    public static int bsearch(int[] array, int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the key: ");
        int key = sc.nextInt();

        int start = 0, end = n - 1;

        while(start <= end){
            int middle = (start + end) / 2;
            if(array[middle] == key){
                return(middle);
            }
            else if(array[middle] > key){
                end = middle;
            }
            else{
                start = middle + 1;
            }
        }

        return(-1);
    }

    public static void getArray(int[] array, int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}