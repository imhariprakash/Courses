import java.io.*;
import java.util.*;

public class RemoveVowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] array = str.toCharArray();
        removeVowel(array, str.length());
        printArray(array);
    }
    
    public static void removeVowel(char[] arr, int n){
        for(int i = 0; i < n; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){
                arr[i] = '.';
            }
        }
    }
    
    public static void printArray(char[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] != '.'){
                System.out.print(array[i]);
            }
        }
    }
}