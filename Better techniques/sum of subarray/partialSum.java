import java.util.Scanner;
class partialSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int[] array = new int[n];
        getArray(array);
        int[] partArray = new int[n + 1];
        partSum(array, partArray);
        System.out.print("Enter the subarray: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(partArray[b] - partArray[a - 1]);
        sc.close();
    }

    public static void partSum(int[] array, int[] partArray){
        partArray[0] = 0;
        for(int i = 1; i < partArray.length; i++){
            partArray[i] = array[i - 1] + partArray[i - 1];
        }
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