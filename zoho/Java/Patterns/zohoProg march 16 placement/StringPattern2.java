import java.io.*;
import java.util.*;

public class StringPattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = getLength(str);
        if(n % 2 == 1){
            for(int i = 0; i <= (n - 1)/ 2; i++){
                for(int j = 0; j < n; j++){
                    if((j == (n / 2 - i)) || (j == (n / 2 + i))){
                        System.out.print(str.charAt(n / 2 - i));
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int i = n / 2 - 1; i >= 0; i--){
                for(int j = 0; j < n; j++){
                    if((j == (n / 2 - i)) || (j == (n / 2 + i))){
                        System.out.print(str.charAt(n / 2 - i));
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        else{
            for(int i = 0; i < n / 2; i++){
                for(int j = 0; j < n; j++){
                    if((j == (n / 2 + i)) || (j == (n / 2 -1 -i))){
                        System.out.print(str.charAt(n / 2 - i - 1));
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } 
            
            for(int i = n / 2 - 2; i >= 0; i--){
                for(int j = 0; j < n; j++){
                    if((j == (n / 2 - i - 1)) || (j == (n / 2 + i))){
                        System.out.print(str.charAt(n / 2 - i - 1));
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        
    }
    
    public static int getLength(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count++);
            }
        }catch(Exception e){
            return count - 1;
        }
    }
}