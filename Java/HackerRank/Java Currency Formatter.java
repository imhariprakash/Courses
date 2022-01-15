import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rem,num,dec;
        double payment = scanner.nextDouble();
        scanner.close();
        num=(int)payment;
        String us=""+num%1000,india=us,china=us,france=us;
        num=num/1000;
        dec=((int)(payment*100) % 100);
        while(num != 0){
            rem = num % 1000;
            us = rem + "," + us;
            india = rem + "," + india;
            china = rem + "," + china;
            france = rem + " " + france;
            num=num/1000;
        }
        us = "$" + us + "." + dec;
        india ="Rs." + india + "." + dec;
        china = "￥" +china + "." + dec;
        france = france + "," + dec +" €";
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}