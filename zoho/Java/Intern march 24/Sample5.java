import java.util.Scanner;
 
class Sample5{

    public static int LEN = 10;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String[] array = {"1", "15", "35", "4", "20", "18"};
        String[] array = {"11111", "2222", "333", "44", "5", "1234556", "2345678", "3456789", "34567876543", "098765678987678765678"};
        int[] lenArray = new int[LEN];
        sort(array, lenArray, LEN);
        printArray(array, LEN);
        sc.close();
    }

    public static void printArray(String[] array, int n){
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void sort(String[] array, int[] lenArray, int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
               if(isGreater(array[i], array[j])){
                    swapString(array, i, j);
                }
            }
        }
    }

    public static boolean isGreater(String str1, String str2){

        if(str1.length() > str2.length()){
            return true;
        }
        if(str1.length() < str2.length()){
            return false;
        }
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) > str2.charAt(i)){
                return true;
            }
            else if(str1.charAt(i) < str2.charAt(i)){
                return false;
            }
        }
        return false;
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