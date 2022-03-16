import java.io.*;
import java.util.*;

public class BigNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        getOutput(array, n);
    }
    
    public static void getOutput(int[] array, int n){
        for(int i = 0; i < n; i++){
            int num = 100000;
            for(int j = 0; j < n; j++){
                if((array[j] >= array[i]) && (num > array[j]) && (i != j)){
                    num = array[j];
                }
            }
            if(num != 100000)
                System.out.print(array[i] + "->" + num);
            else
                System.out.print(array[i] + "-> ");
            if(i != n - 1){
                System.out.print(",");
            }
        }
    }
}