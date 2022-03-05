import java.util.Scanner;

class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = "";
        int count = 0, i, letter = 0;
        int nword = numSpace(str);
        String [] strArray = new String[nword];
        int[] countArray = new int[nword];

        // split words
        
        for(i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                strArray[count] = temp;
                countArray[count++] = letter;
                temp = "";
                letter = 0;
            }
            else{
                if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
                    temp = temp + (char)(str.charAt(i) + 32);
                else
                    temp = temp + str.charAt(i);
                letter ++;
            }
        }
        strArray[count] = temp;
        countArray[count] = letter;
        count = 0;

        // check anagram between

        for(i = 0; i < nword - 1; i++){
            temp = "";
            int icount = 0;
            for(int j = i + 1; j < nword; j++){
                if(countArray[i] != countArray[j]){
                    continue;
                }
                else if(isAnagram(strArray[i], strArray[j], countArray[i])){ 
                    temp = temp + "," + strArray[j];
                    countArray[j]--;
                    icount++;
                }
            }
            if(icount != 0){
                temp = strArray[i] + temp;
                System.out.println("Group " + ++count + " :" + " [" + temp + "]");
            }
        }
        if(count == 0){
            System.out.println("No anagrams.");
        }

        sc.close();

    }

    public static boolean isAnagram(String str1, String str2, int len){
        char[] alpha1 = new char[26];
        char[] alpha2 = new char[26];
        for(int i = 0; i < len; i++){
            alpha1[str1.charAt(i) - 97]++; 
            alpha2[str2.charAt(i) - 97]++;    
        }

        for(int i = 0; i < 26; i++){
            if(alpha1[i] != alpha2[i]){
                return false;
            }
        }

        return true;
    }

    public static int numSpace(String str){
        int count = 1;
        System.out.println();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
}


/*

for debugging useful functions : this

public static void printStringArray(String[] array, int nword){
        for(int i = 0; i < nword; i++){
            System.out.print(array[i] + "  ");
        }
    }

    public static void printIntArray(int[] array, int nword){
        System.out.println();
        for(int i = 0; i < nword; i++){
            System.out.print(array[i] + " ");
        }
    }


    public static boolean isPalindrome(String str1, String str2, int len){
        for(int i = 0; i < len; i++){
            if(!(str1.charAt(i) == str2.charAt(len - 1 - i))){
                return false;
            }
        }

        return true;
    }


    */

/*abstract
rat was saw the art
tap tub are rat era but the ear apt art
I saw a dog
*/

/*abstract

tap tub are rat era but the ear apt art

Group 1 : [tap,apt]
Group 2 : [tub,but]
Group 3 : [are,era,ear]
Group 4 : [rat,art]


PS C:\Users\S HARIPRAKASH\Desktop> cd "c:\Users\S HARIPRAKASH\Desktop\" ; if ($?) { javac Anagram.java } ; if ($?) { java Anagram }
rat was saw the art

Group 1 : [rat,art]
Group 2 : [was,saw]


I saw a dog

No anagrams.
*/