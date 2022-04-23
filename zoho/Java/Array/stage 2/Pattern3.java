import java.io.*;
import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n / 2; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < n - 2 * (i + 1); j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = 0 ; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
        
        for(int i = 0; i < Math.floor((n - 1) / 2.0); i++){
            for(int j = i; j < Math.floor((n-1)/2.0); j++){
                System.out.print("*");
            }
            for(int j = n % 2; j < 2 * (i + 1); j++){
                System.out.print(" ");
            }
            for(int j = i; j < Math.floor((n-1)/2.0); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}