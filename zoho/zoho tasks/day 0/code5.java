import java.util.Scanner;
 
class code5{

    public static int LEN = 6;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] array = {"1", "15", "35", "4", "20", "18"};
        int[] lenArray = new int[LEN];
        getLenArray(array, lenArray, LEN);
        sort(array, lenArray, LEN);
        printArray(array, LEN);
        sc.close();
    }

    public static void printArray(String[] array, int n){
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void getLenArray(String[] array, int[] lenArray, int n){
        for(int i = 0; i < n; i++){
            lenArray[i] = getLength(array[i]);
        }
    }

    public static void sort(String[] array, int[] lenArray, int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(lenArray[i] > lenArray[j]){
                    swapString(array, i, j);
                    swap(lenArray, i, j);
                }
                else if((lenArray[i] == lenArray[j]) && (isGreater(array[i], array[j], lenArray[i]))){
                    swapString(array, i, j);
                    swap(lenArray, i, j);
                }
            }
        }
    }

    public static boolean isGreater(String str1, String str2, int n){
        for(int i = 0; i < n; i++){
            if(str1.charAt(i) > str2.charAt(i)){
                return true;
            }
            else if(str1.charAt(i) < str2.charAt(i)){
                return false;
            }
        }
        return false;
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void swapString(String[] array, int i , int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int getLength(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count++);
            }
        }catch(Exception e){
            return(count - 1);
        }
    }

    public static void printArray(int[] array, int n){
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}