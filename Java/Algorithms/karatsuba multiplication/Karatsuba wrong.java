import java.util.Scanner;
import java.math.BigInteger;
 
class Karatsuba{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        // String num1 = "3141592653589793238462643383279502884197169399375105820974944592";
        // String num2 = "2718281828459045235360287471352662497757247093699959574966967627";
        String num1 = "567";
        String num2 = "123";
        if((num1.charAt(0) == '-' && num2.charAt(0) != '-') || (num1.charAt(0) != '-' && num2.charAt(0) == '-')){
            System.out.println("-");
        }
        if(num1.charAt(0) == '-'){
            num1 = num1.substring(1);
        }
        if(num2.charAt(0) == '-'){
            num2 = num2.substring(1);
        }
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        System.out.println(karatsuba(a, b));
    }

    public static BigInteger karatsuba(BigInteger num1, BigInteger num2){
        int m = num1.min(num2).toString().length() - 1;
        if(m == 0){
            return num1.multiply(num2);
        }

        int n = num1.toString().length();
        int k = num2.toString().length();
        int n_2 = n / 2;
        int k_2 = k / 2;
        if(n % 2 == 1){
            n_2++;
        }
        if(k % 2 == 1){
            k_2++;
        }

        BigInteger a = num1.shiftRight(n_2);
        BigInteger b = num1.subtract(a.shiftLeft(n_2));
        BigInteger c = num2.shiftRight(k_2);
        BigInteger d = num2.subtract(c.shiftLeft(k_2));

        System.out.println(a + " " + n + " " + k + " " + n_2 + " " + k_2 + " " + num1 + " " + a.shiftLeft(n_2) + " " + b + " " + c + " " + d);

        BigInteger ac = karatsuba(a, c);
        BigInteger bd = karatsuba(b, d);
        BigInteger ad_bc = karatsuba(a.add(b), c.add(d));
        BigInteger ad_bc_minus_ac_minus_bd = ad_bc.subtract(ac).subtract(bd);

        return ac.shiftLeft(n_2 * 2).add(ad_bc_minus_ac_minus_bd.shiftLeft(n_2)).add(bd.shiftLeft(n_2));
    }
}