import java.util.Scanner;

class Converter{
    static String toBinary(int n){
        String result = "";
        while(n!=0){
            result = (n % 2) + result;
            n=n/2;
        }
        return result;
    }
}


public class int_to_binary {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}