import java.io.*;
import java.util.*;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        int [] array = new int[10];
        for(i = 0; n > 0; i++){    
            array[i] = n % 2;    
            n = n / 2;    
        }   
        for(i = i - 1; i >= 0; i--){    
            System.out.print(array[i]);    
        }    
    }
}