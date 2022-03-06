import java.util.Scanner;

class PalindromeSubstring_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = 0, end = 0;
        int prev = 0;
        char[] array = new char[str.length()];
        int count = removeSpace(str, array);

        for(int i = 0; i < count - 1; i++){
            for(int j = count - 1; j >= i; j--){
                if(isPalindrome(array, i, j, prev)){
                    prev = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }
        printArray(array, start, end);
        sc.close();
    }

    public static void printArray(char[] array, int start, int end){
        for(int i = start; i <= end; i++){
            System.out.print(array[i]);
        }
    }

    public static boolean isPalindrome(char[] str, int start, int end, int prev){
        int len = end - start + 1;
        for(int i =start; i <= (start + end)/2; i++){
            if(isNotSame(str[i], str[end - i + start])){
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

    public static int removeSpace(String str, char[] array){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122) || (str.charAt(i) >= 48 && str.charAt(i) <= 57)){
                array[count++] = str.charAt(i);
            }
        }
        return count;
    }
}


/*abstract

Mayalam Googlelgoog
Googlelgoog

Wassamassdaw
ssamass

*/