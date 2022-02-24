import java.util.Scanner;

public class DigitMultiply {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      digitMul(n);
    }
    
    public static void digitMul(int n){
        int mul = 1;
        while(n != 0){
            mul *= n % 10;
            n = n / 10;
        }
        System.out.println(mul);
    }
}