import java.util.Scanner;
 
class SubArrays{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] array = getArray();

        for(int i = array.length; i > 0; i--){
            for(int j = 0; j < array.length; j++){
                if(j + i - 1 >= array.length){  // this if statement unnecessary -> see below
                    break;
                }
                printSubArray(array, j, j + i - 1);
            }
        }
    }

    public static void printSubArray(int[] array, int start, int end){
        for(int i = start; i <= end; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] getArray(){
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        return array;
    }
}

/* modified : for i,j altered to remove the need for if statement there

import java.util.Scanner;
 
class SubArraysSum_PrefixSumMatrix{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] array = getArray();
        int[] prefixSum = getPrefixSum(array);

        for(int i = array.length; i > 0; i--){
            for(int j = 0; j <= array.length - i; j++){
                printSubArray(array, j, j + i - 1);                
            }
        }
    }

    public static int[] getPrefixSum(int[] array){
        int[] prefixSum = new int[array.length];
        prefixSum[0] = array[0];
        for(int i = 1; i < array.length; i++){
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }
        return prefixSum;
    }

    public static void printSubArray(int[] array, int start, int end){
        for(int i = start; i <= end; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] getArray(){
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        return array;
    }
}

*/
