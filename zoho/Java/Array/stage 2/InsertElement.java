import java.io.*;
import java.util.*;

public class InsertElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n + 1];
        
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        
        int num = sc.nextInt();
        int index = getIndex(array, n, num);
        fixArray(array, n, num, index);
        n++;
        printArray(array, n);
        sc.close();        
    }
    
    public static void printArray(int[] array, int n){
        for(int i = 0; i < n; i++){
           System.out.print(array[i] + " ");
        }
    }
    
    public static int getIndex(int[] array, int n, int num){
        for(int i = 0 ; i < n; i++){
            if(array[i] > num){
                return i;
            }
        }
        return(n);
    }
    
    public static void fixArray(int[] array, int n, int elem, int index){
        int i;
        for(i = index; i < n; i++){
            int temp = array[i];
            array[i] = elem;
            elem = temp;
        }
        array[i] = elem;
    }
}