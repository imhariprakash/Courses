import java.util.Scanner;
 
class SubArraysSum_BruteForce{  // O(n^3) - brute force
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] array = getArray();
        int result = Integer.MIN_VALUE;

        for(int i = array.length; i > 0; i--){
            for(int j = 0; j < array.length; j++){
                if(j + i - 1 >= array.length){
                    break;
                }
                int temp = printSubArray(array, j, j + i - 1);
                if(temp > result){
                    result = temp;
                }
            }
        }
        System.out.println(result);
    }

    public static int printSubArray(int[] array, int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += array[i];
        }
        return sum;
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