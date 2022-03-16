import java.io.*;
import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = getLength(str);
        
        for(int i = 0; i < n / 2; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = n / 2; j < n; j++){
                System.out.print(str.charAt(j));
            }
            for(int j = 0; j < n / 2 - i; j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
        
        for(int i = 0; i < (n + 1) / 2; i++){
            for(int j = (n + 1) / 2; j < n + i ; j++){
                System.out.print(" ");
            }
            for(int j = n / 2; j < n - i; j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
    
    public static int getLength(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count++);
            }
        }catch(Exception e){
            return(count - 1);
        }
    }
}