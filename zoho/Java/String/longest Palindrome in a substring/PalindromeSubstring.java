import java.util.Scanner;

class PalindromeSubstring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        int prev = 0;
        str = removeSpace(str);
        for(int i = 0; i < str.length() - 1; i++){
            for(int j = str.length() - 1; j >= i; j--){
                if(isPalindrome(str, i, j, prev)){
                    prev = j - i + 1;
                    res = "";
                    for(int k = i; k <= j; k++){
                        res = res + str.charAt(k);
                    }
                }
            }
        }
        System.out.println(res);
        sc.close();
    }

    public static boolean isPalindrome(String str, int start, int end, int prev){
        int len = end - start + 1;
        for(int i =start; i <= (start + end)/2; i++){
            if(isNotSame(str.charAt(i), str.charAt(end - (i - start)))){
                return false;
            }
        }
        if(len > prev){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isNotSame(char a, char b){
        if(a >= 65 && a <= 90){
            a = (char)(a + 32);
        }
        if(b >= 65 && b <= 90){
            b = (char)(b + 32);
        }
        if(a != b){
            return true;
        }
        else{
            return false;
        }
    }

    public static String removeSpace(String str){
        String res = "";
        for(int i = 0; i < str.length(); i++){
            if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122) || (str.charAt(i) >= 48 && str.charAt(i) <= 57)){
                res = res + str.charAt(i);
            }
        }
        return res;
    }
}




// Wassamassdaw
// Mayalam Googlegoog

/*

Wassamassdaw
ssamass

Mayalam Googlelgoog
Googlelgoog

*/