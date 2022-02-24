import java.io.*;
import java.util.*;

public class Target {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        getTarget(array, n, target);
    }
    
    public static void getTarget(int[] array, int n, int target){
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(array[i] + array[j] == target){
                    System.out.println(array[i]+","+array[j]);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}