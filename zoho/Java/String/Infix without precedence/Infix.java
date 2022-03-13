/*

1. Given a String with numbers and operators. Perform the operation on the numbers in their respective order. Operator precedence need not be considered. The input string will have the numbers followed by the operators.

Input: "12345 * + - + "
Result: 6 [Explanation: 1 * 2 + 3 - 4 + 5 = 6]
Input: "374291 - - * + -"
Result: -4 [Explanation: 3 - 7 - 4 * 2 + 9 - 1 = -8]
Input: "67542 - / + -"
Result: 2
Input: "12345 * / + -"
Result: -1

*/

import java.util.Scanner;
class Infix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = getLength(str);
        int ind = getSymbol(str, n);

        Arithmetic(str, n, ind);

        sc.close();
    }

    public static void Arithmetic(String str, int n, int ind){
        int ans = (int)(str.charAt(0) - 48), j = 1;
        for(int i = ind; i < n; i = i + 2){
            if(str.charAt(i) == '+'){
                ans = add(ans, (int)(str.charAt(j++) - 48));
            }
            else if(str.charAt(i) == '-'){
                ans = sub(ans, (int)(str.charAt(j++) - 48));
            }
            else if(str.charAt(i) == '*'){
                ans = mul(ans, (int)(str.charAt(j++) - 48));
            }
            else if(str.charAt(i) == '/'){
                ans = div(ans, (int)(str.charAt(j++) - 48));
            }
            else if(str.charAt(i) == '%'){
                ans = mod(ans, (int)(str.charAt(j++) - 48));
            }
        }
        System.out.println(ans);
    }

    public static int add(int a, int b){
        return(a + b);
    }

    public static int sub(int a, int b){
        return(a - b);
    }

    public static int mul(int a, int b){
        return(a * b);
    }

    public static int div(int a, int b){
        return(a / b);
    }

    public static int mod(int a, int b){
        return(a % b);
    }

    public static int getSymbol(String str, int n){
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' || str.charAt(i) == '%'){
                return i;
            }
        }
        return -1;
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