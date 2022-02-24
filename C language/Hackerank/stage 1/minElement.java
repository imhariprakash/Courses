import java.util.*;

public class minElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        // getArray(array, n);
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        getMin(array, n);
        sc.close();
    }
    
    public static void getMin(int[] array, int n){
        int min = 1000000;
        for(int i = 0; i < n; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}