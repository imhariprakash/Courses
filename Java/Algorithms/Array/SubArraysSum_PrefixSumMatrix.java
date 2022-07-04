import java.util.Scanner;
 
class SubArraysSum_PrefixSumMatrix{ // O(n^2) + O(n) = O(n^2)
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] array = getArray();
        int[] prefixSum = getPrefixSum(array);
        int result = Integer.MIN_VALUE;

        for(int i = array.length; i > 0; i--){
            for(int j = 0; j <= array.length - i; j++){
                result = j > 0 ? Math.max(result, prefixSum[j + i - 1] - prefixSum[j - 1]) : Math.max(result, prefixSum[j + i - 1]);              
            }
        }  

        System.out.println(result);
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