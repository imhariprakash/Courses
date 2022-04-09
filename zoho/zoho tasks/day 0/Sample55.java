import java.util.Scanner;
 
class Sample55{

    public static int LEN = 6;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] array = {"1", "15", "35", "4", "20", "18"};
        //int[] lenArray = new int[LEN];
        //getLenArray(array, lenArray, LEN);
        sort(array, 0, 5);
        printArray(array, LEN);
        sc.close();
    }

    public static void printArray(String[] array, int n){
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }

    // public static void getLenArray(String[] array, int n){
    //     for(int i = 0; i < n; i++){
    //         lenArray[i] = getLength(array[i]);
    //     }
    // }

    public static void merge(String arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
  
        String L[] = new String[n1];
        String R[] = new String[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (isGreater(R[j] ,L[i])) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(String arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle poString
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
  
            // Merge the sorted halves
            merge(arr, l, m, r);
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