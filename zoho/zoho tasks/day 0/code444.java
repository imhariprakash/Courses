import java.util.Scanner;
 
class code444{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 9, 7, 56, 36, 91, 42};
        int[] min = new int[7];

        for(int i = 0; i < 7; i++){
            int count = 0;

            for(int j = i + 1; j < 7; j++){
                if(array[j] >= array[i]){
                    min[count++] = array[j];
                }
            }
            array[i] = count == 0 ? -1 : mini(min, count);
        }

        printArray(array, 7);
        sc.close();
    }

    public static int mini(int[] array, int count){
        int min = array[0];
        for(int i = 1; i < count; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static void printArray(int[] array, int n){
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
