import java.io.*;
import java.util.*;

public class ArrangeVowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        getVowel(str);
    }
    
    public static void getVowel(String str){
        int [] count = {0, 0, 0, 0, 0};
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                count[0]++;
            }
            else if(str.charAt(i) == 'e'){
                count[1]++;
            }
            else if(str.charAt(i) == 'i'){
                count[2]++;
            }
            else if(str.charAt(i) == 'o'){
                count[3]++;
            }
            else if(str.charAt(i) == 'u'){
                count[4]++;
            }
        }
        printArray(count);
    }
    
    public static void printArray(int[] count){
        char[] array = {'a', 'e', 'i', 'o', 'u'};
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < count[i]; j++){
                System.out.print(array[i]);
            }
        }
    }
}