import java.util.Scanner;
 
class kadanes_Algorithm_Maximum_Subarray {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] array = getArray();
        int maxSum = array[0];  // if all are negative, this will help - is maxSum is initialized to 0 -> problem with negative arrays
        int currentSum = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];

            if (currentSum > maxSum) { // if currentSum is greater than maxSum, then update maxSum -> need to be before the if statement below
                maxSum = currentSum;
            }

            if(currentSum < 0){
                currentSum = 0;
            }
        }

        System.out.println(maxSum);
    }

    public static int[] getArray(){
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        return array;
    }
}