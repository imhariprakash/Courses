import java.util.*;
 
class NearestPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int[] array = new int[10];
        int count = getArray(array, num);
        reverse(array, 0, count - 1);
        getPalindrome(array, count);
        copyArray(array, 0, count - 1);
        sc.close();
    }

    public static void getPalindrome(int[] array, int count) {
        int temp = (count - 1) / 2;
        int var = array[temp];
        array[temp] = array[temp] <= array[temp + 1] ? array[temp] + 1 : array[temp];
        if(array[temp] == var){
            array[temp] = array[temp] >= array[0] ? array[count / 2] + 1 : array[temp];
        }
    }

    public static void copyArray(int[] array, int start, int end){
        for(int i = start; i <= (end + start) / 2; i++){
            array[end + start - i] = array[i];
        }
        printArray(array, end + 1);
    }

    public static void reverse(int[] array, int start, int end){
        for(int i = start; i <= (end + start) / 2; i++){
            int temp = array[i]; 
            array[i] = array[end + start - i];
            array[end + start - i] = temp;
        }
    }

    public static int getArray(int[] array, int num){
        int count = 0;
        while(num > 0){
            array[count++] = num % 10;
            num = num / 10;
        }
        return count;
    }

    public static void printArray(int[] array, int count){
        System.out.println();
        for(int i = 0; i < count; i++){
            System.out.print(array[i]);
        }
    }
}