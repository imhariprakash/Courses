import java.io.*;
import java.util.*;

public class pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int num = n;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int a = max(max(n - i, n - j), max(n - (n - 1 - i) , n - (n - 1 - j)));
                if(n % 2 == 0){
                    System.out.print((a + 1) % 2);
                }
                else{
                    System.out.print(a % 2);
                }
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