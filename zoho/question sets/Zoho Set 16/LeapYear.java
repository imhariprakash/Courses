import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(leap(n))
        System.out.print("Its Leap Year");
        else
        System.out.print("Its Non leap year");  
        sc.close();      
    }
    static boolean leap(int n)
    {
        if((n%4==0) &&((n%400==0) || (n%100!=0)))
        return true;
        return false;
    }
}