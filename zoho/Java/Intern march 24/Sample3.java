import java.util.Scanner;
 
class Sample3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = getLength(str);
        int result = getChar(str.charAt(0));
        int ptr = (n + 1) / 2;
        for(int i = 1; i < (n + 1) / 2; i++){
            result = getResult(result, getChar(str.charAt(i)), str.charAt(ptr++));
        }
        System.out.print(result);
        sc.close();
    }

    public static int getResult(int a, int b, char sym){

        if(sym == '+'){
            return(a + b);
        }
        else if(sym == '-'){
            return(a - b);
        }
        else if(sym == '*'){
            return(a * b);
        }
        else if(sym == '/'){
            return(a / b);
        }
        else if(sym == '%'){
            return(a % b);
        }
        return(-1);
    }

    public static int getChar(char c){
        return((int)(c - '0'));
    }

    public static int getLength(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count++);
            }
        }catch(Exception e){
            return(count - 1);
        }
    }
}