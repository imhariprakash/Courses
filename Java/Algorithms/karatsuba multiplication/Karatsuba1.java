import java.util.Scanner;
import java.math.BigInteger;
 
class Karatsuba1{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        // String num1 = "3141592653589793238462643383279502884197169399375105820974944592";
        // String num2 = "2718281828459045235360287471352662497757247093699959574966967627";

        String num1 = "5678";
        String num2 = "12388";

        // String num1 = "47";
        // String num2 = "7";

        System.out.println("Karatsuba Multiplication of " + num1 + " and " + num2 + " is : " + karatsuba(new BigInteger(num1), new BigInteger(num2)));

        
    }

    public static BigInteger karatsuba(BigInteger num1, BigInteger num2){
        int len1 = num1.toString().length();
        int len2 = num2.toString().length();

        if(len1 == 1 && len2 == 1){
            return num1.multiply(num2);
        }

        if(num1.equals(BigInteger.ZERO)|| num2.equals(BigInteger.ZERO)){
            return BigInteger.ZERO;
        }

        int n = Math.max(len1, len2);

        if(n % 2 == 1){
            n++;
        }

        BigInteger a = num1.divide(BigInteger.TEN.pow(n/2));              //first half of num1
        BigInteger b = num1.mod(BigInteger.TEN.pow(n/2));                 //second half of num1
        BigInteger c = num2.divide(BigInteger.TEN.pow(n/2));              //first half of num2
        BigInteger d = num2.mod(BigInteger.TEN.pow(n/2));                 //second half of num2


        BigInteger ac = karatsuba(a, c);                                     //ac * (10 ^ n) + (ad + bc) * 10 ^ (n/2) + bd
        BigInteger bd = karatsuba(b, d);
        BigInteger ad_bc = karatsuba(a.add(b), c.add(d)).subtract(ac).subtract(bd);    // ad + bc  = (a + b) * (c + d) - ac - bd
        BigInteger ans = ac.multiply(BigInteger.TEN.pow(n));
        ans = ans.add((ad_bc.multiply(BigInteger.TEN.pow(n/2)))).add(bd);

        return(ans);
    }
}
