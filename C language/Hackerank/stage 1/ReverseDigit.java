import java.io.*;
import java.util.*;

public class ReverseDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseEven(n);
    }
    
    public static void reverseEven(int n){
        int rev = 0;
        while(n != 0){
            if(n % 2 == 0){
                rev = rev * 10 + (n % 10);
            }
            n /= 10;
        }
        System.out.println(rev);
    }
}