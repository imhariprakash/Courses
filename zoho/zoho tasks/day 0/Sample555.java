import java.util.Scanner;
 
class Sample555{

    public static int LEN = 6;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] array = {"1", "15", "35", "4", "20", "18"};
        //int[] lenArray = new int[LEN];
        //getLenArray(array, lenArray, LEN);
        quickSort(array, 0, 5);
        printArray(array, LEN);
        sc.close();
    }

    public static void printArray(String[] array, int n){
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int partition(String[] arr, int low, int high)
    {
     
        String pivot = arr[high];
        int i = (low - 1);
     
        for(int j = low; j <= high - 1; j++)
        {
            if (isGreater(pivot, arr[j]))
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
     
    static void quickSort(String[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
     
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static boolean isGreater(String str1, String str2){
        if(str1.length() > str2.length())
            return true;
        if(str1.length() < str2.length())
            return false;
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

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void swap(String[] array, int i , int j){
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
}