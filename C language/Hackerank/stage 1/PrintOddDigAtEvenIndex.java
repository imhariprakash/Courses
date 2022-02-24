import java.io.*;
import java.util.*;

public class PrintOddDigAtEvenIndex {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOddDigAtEven(n);
    }
    
    public static void printOddDigAtEven(int n){
        int count = 1, num = 0;
        n = reverse(n);
        while(n != 0){
            if(count % 2 == 0 && (n % 10) % 2 != 0){
                System.out.print(n % 10);
                num++;
            }
            count++;
            n = n / 10;
        }
        if(num == 0){
            System.out.print(0);
        }
    }
    
    public static int reverse(int n){
        int ans = 0;
        while(n != 0){
            ans = ans * 10 + (n % 10) ; 
            n = n/10;
        }
        return ans;
    }
}