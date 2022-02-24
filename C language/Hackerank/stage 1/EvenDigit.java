import java.io.*;
import java.util.*;

public class EvenDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenDigit(n);
    }
    
    public static void evenDigit(int n){
        int count = 0;
        while(n != 0){
            if((n % 10) % 2 == 0){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}