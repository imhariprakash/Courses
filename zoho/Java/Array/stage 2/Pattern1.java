import java.io.*;
import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            for(int i = 0; i < Math.ceil(n / 2.0); i++){
                for(int j = 0; j < n; j++){
                    if(i == j || i + j == (n-1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        
        for(int i = 0; i < (n-1)/2; i++){
            for(int j = i; j < ((n-1)/2 - 1); j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = n % 2; j <= (2*i+1); j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}