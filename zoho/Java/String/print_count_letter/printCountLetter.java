import java.util.Scanner;
class printCountLetter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = getLength(str);
        printNumber(str, len);
    }

    public static void printNumber(String str, int n){
        char ch = str.charAt(0);
        int start = 1, end, count, i;
        for(i = 1; i < n; i++){
            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
                end = i - 1;
                count = extract(str, start, end);
                printLetter(ch, count);
                start = i + 1;
                ch = str.charAt(i);
            }
        }
        count = extract(str, start, i - 1);
        printLetter(ch, count);
    }

    public static void printLetter(char ch, int count){
        for(int i = 0; i < count; i++){
            System.out.print(ch);
        }
    }

    public static int extract(String str, int start, int end){
        int count = 0;
        for(int i = start; i <= end; i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                count = count * 10 + (int) (str.charAt(i) - 48);
            }
        }
        return count;
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

/*----------------------------------------------------------------

Eg 1: Input: a1b10
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.


a1b10
abbbbbbbbbb

b3c6d15
bbbccccccddddddddddddddd

*/