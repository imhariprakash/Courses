/*

4. Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.

Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234 
        Output: -1

aaaaaaaaaaa
aaaaaaaaaaa
0

aaaaaaaaaaa
aaaaaaaaaab
-1

coolgoose oo
1

Input       Output

football foot   0

mickey mouse    -1

abcdefghijklmnopqrs s   18

helloworld helloworld   0

FrodoBaggins bagg   -1

Hell Hello  -1

        */

import java.util.Scanner;
class Substring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int n = getLength(str1);
        int m = getLength(str2);

        int i = 0, j = 0;
        for(; i < n; i++){
            if(j == m){
                System.out.println(i - j);
                return;
            }
            else if(str1.charAt(i) == str2.charAt(j)){
                j++;
            }
            else if(str1.charAt(i) != str2.charAt(j)){
                i = i - j;
                j = 0;
            }
        }
        if(j == m){ 
            System.out.println(i - j);            
        }
        else{
            System.out.println(-1);
        }
        sc.close();
    }

    public static int getLength(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count++);
            }
        }catch(Exception e){
            return count -1;
        }
    }
}