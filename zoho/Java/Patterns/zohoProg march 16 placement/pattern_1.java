import java.io.*;
import java.util.*;

public class pattern_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int num = n;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(max(max(n - i, n - j), max(n - (n - 1 - i) , n - (n - 1 - j))));
            }
            System.out.println();
        }
    }
    
    public static int max(int a, int b){
        if(a > b)
            return a;
        if(a < b)
            return b;
        return a;
    }
}