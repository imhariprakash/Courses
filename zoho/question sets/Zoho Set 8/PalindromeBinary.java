import java.util.Scanner;
public class PalindromeBinary{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(palindrome(binary(n)))
        System.out.println("-Palindrome");
        else
        System.out.print("-Not a Palindrome");
        sc.close();
    }
    static int binary(int n)
    {
        int s=0,d=1;
        while(n>0)
        {
            s=s+(n%2)*d;
            d=d*10;
            n=n/2;
        }
        return s;
    }
    static boolean palindrome(int n)
    {
        int m=n,s=0;
        while(n>0)
        {
            s=s*10+(n%10);
            n/=10;
        }
        System.out.print(m);
        if(m==s)
        return true;
        else 
        return false;
    }
}