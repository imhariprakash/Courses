import java.util.Scanner;

class ReverseWordString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = length(str);
        char[] array = new char[len];
        convertTocharArray(str, len, array);
        int start = 0, i;

        for(i = 0; i < len; i++){
            if(array[i] == ' '){
                reverse(array, start, i - 1);
                start = i + 1;
            }
        }
        reverse(array, start, i - 1);

        printArray(array, len);
        
    }

    public static void printArray(char[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void reverse(char[] array, int start, int end){
        for(int i = start; i <= ((start + end) / 2); i++){
            char temp = array[i]; 
            array[i] = array[end + start - i];
            array[end + start - i] = temp;
        }
    }

    public static void convertTocharArray(String str, int n, char[] array){
        for(int i = 0; i < n; i++){
            array[i] = str.charAt(i);
        }
    }

    public static int length(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }catch(Exception e){
            return count;
        }
    }
}