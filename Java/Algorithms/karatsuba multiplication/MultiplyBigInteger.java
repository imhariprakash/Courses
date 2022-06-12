import java.util.Scanner;
import java.math.BigInteger;
 
class MultiplyBigInteger{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String num1 = "3141592653589793238462643383279502884197169399375105820974944592";
        String num2 = "2718281828459045235360287471352662497757247093699959574966967627";
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        System.out.println(a.multiply(b));
    }
}