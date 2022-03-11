import java.util.Scanner;

class GreatestInt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = getCount(n);
        int[] array = new int[count];
        getArray(array, n, count);
        sort(array, count);
        printArray(array, count);
    }

    public static void printArray(int[] array, int count){
        for(int i = 0; i < count; i++){
            System.out.print(array[i]);
        }
    }

    public static void sort(int[] array, int count){
        for(int i = 0; i < count - 1; i++){
            for(int j = i + 1; j < count; j++){
                if(array[i] > array[j]){
                    swap(array, i, j);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void getArray(int[] array, int n, int count){
        for(int i = count - 1; i >= 0; i--){
            array[i] = n % 10;
            n /= 10;
        }
    }

    public static int getCount(int n) {
        int count = 0;
        while(n != 0){
            n /= 10;
            count++;
        }
        return count;
    }
}