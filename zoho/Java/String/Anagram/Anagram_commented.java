import java.util.Scanner;

class Anagram_commented{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = "";  // for temporarily storing words to save in String array
        int count = 0, i, letter = 0; //letter stores number of letters of each word - countArray
        int nword = numSpace(str); // get number of spaces + 1 = no of words
        String [] strArray = new String[nword];
        int[] countArray = new int[nword];

        // split words
        
        for(i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){       //when ever empty space save the word
                strArray[count] = temp;     //when its space just assign the word String to strArray
                countArray[count++] = letter; //count letter - so each time no need to count length
                temp = "";  // initialize
                letter = 0; // initialize for next word
            }
            else{
                if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
                    temp = temp + (char)(str.charAt(i) + 32);   // when capital - convert to small
                else
                    temp = temp + str.charAt(i);  // else just assign
                letter ++;  
            }
        }
        strArray[count] = temp;     // last word does nt have space after it so after loops just assign strArray last word and length of last word in countArray
        countArray[count] = letter;
        count = 0;

        // check anagram between

        for(i = 0; i < nword - 1; i++){
            temp = "";
            int icount = 0;
            for(int j = i + 1; j < nword; j++){      // compare first word with every rem word - check for anagrams - take all anagram - no repitation - means don't use next time in loop - solution - increase/decrease length - so next time failed
                if(countArray[i] != countArray[j]){
                    continue; // when length not equal two case : by default var length words or for avoiding repitation we altered the length
                }
                else if(isAnagram(strArray[i], strArray[j], countArray[i])){ 
                    temp = temp + "," + strArray[j];   // format - word,word,word
                    countArray[j]--; //decrement to avoid repitation
                    icount++; // we need to display only when there is anagram (note : not entire matching - 1 st word any anagrams with rem word)
                }
            }
            if(icount != 0){
                temp = strArray[i] + temp;
                System.out.println("Group " + ++count + " :" + " [" + temp + "]"); //when the current elem match with any remaining elements - print
            }
        }
        if(count == 0){
            System.out.println("No anagrams."); // when entirely not even a single anagram - just display no anagram
        }

        sc.close();

    }

    public static boolean isAnagram(String str1, String str2, int len){  // anagram - count alphabets - equal - anagram
        // better appraoch - hashmap or sorting - useful when many are anagrams - else for some anagrams sorting all - not efficient
        char[] alpha1 = new char[26];
        char[] alpha2 = new char[26];
        for(int i = 0; i < len; i++){
            alpha1[str1.charAt(i) - 97]++; 
            alpha2[str2.charAt(i) - 97]++;    
        }

        for(int i = 0; i < 26; i++){
            if(alpha1[i] != alpha2[i]){  //check equal alphabets.
                return false;
            }
        }

        return true;
    }

    public static int numSpace(String str){
        int count = 1;
        System.out.println();
        for(int i = 0; i < str.length(); i++){  // count space - return spaces - no of words = space + 1
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
}