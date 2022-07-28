import java.util.Scanner;
public class NextSmallestPalindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        nextpalindrome(n);
        sc.close();
    }
    static void nextpalindrome(long n)
    {
        while(true)
        {
            n++;
            if(palindrome(n))
            {
                System.out.println(n);
                break;
            }
        }
    }
    static boolean palindrome(long n)
    {
        long m=n,s=0;
        while(n>0)
        {
            s=s*10+n%10;
            n/=10;
        }
        if(m==s)
        return true;
        return false;
    }
}
