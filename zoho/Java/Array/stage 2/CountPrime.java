import java.io.*;
import java.util.*;

public class CountPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        while(n != 0){
            if(n % 10 == 2 || n % 10 == 3 || n % 10 == 5 || n % 10 == 7 || n % 10 == 1){
                count++;
            }
            n = n /10;
        }
        System.out.println(count);
    }
}