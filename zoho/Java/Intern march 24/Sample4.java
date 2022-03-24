import java.util.Scanner;
 
class Sample4{
    public static int MAX = 10000;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 9, 7, 56, 36, 91, 42};

        for(int i = 0; i < 7; i++){
            int min = MAX;

            for(int j = i + 1; j < 7; j++){
                if(array[j] >= array[i] && min > array[j]){
                    min = array[j];
                }
            }
            array[i] = min != MAX ? min : -1;
        }

        printArray(array, 7);
        sc.close();
    }

    public static void printArray(int[] array, int n){
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}