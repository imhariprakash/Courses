import java.util.Scanner;
 
class InversionsCounterMergeSort{
    public static Scanner sc = new Scanner(System.in);
    public static int inversions = 0;
    public static void main(String[] args){
        //int[] array = {1,20,6,4,5};
        int[] array = {1,2,3,4,-2,-1,7};

        mergeSort(array, 0, array.length - 1);
        System.out.println("Number of inversions: " + inversions);
    }

    public static void bruteForce(int[] array){           // O(n^2)       brute force - selection sort
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    inversions++;
                }
            }
        }
    }

    public static void mergeSort(int[] array, int start, int end){
        if(start < end){ 
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    public static void merge(int[] array, int start, int mid, int end){
        int[] array1 = new int[mid - start + 1];
        int[] array2 = new int[end - mid];

        for(int i = 0; i < array1.length; i++){
            array1[i] = array[start + i];
        }

        for(int i = 0; i < array2.length; i++){
            array2[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0, k = start;

        while(i < array1.length && j < array2.length){
            if(array1[i] < array2[j]){
                array[k] = array1[i];
                i++;
            }
            else{
                array[k] = array2[j];
                inversions+= mid + 1 - start- i;
                System.out.println(i + " " + j + " " + k + " " + mid + " " + inversions);
                j++;
            }
            k++;
        }

        while(i < array1.length){
            array[k] = array1[i];
            i++;
            k++;
        }

        while(j < array2.length){
            array[k] = array2[j];
            j++;
            k++;
        }
    }

    public static int[]  getArray(){
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];


        for(int i = 0; i < n; i++){
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