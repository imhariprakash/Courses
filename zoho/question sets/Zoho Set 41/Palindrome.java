import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(palindromecheck(n));
        sc.close();
    }
    static boolean palindromecheck(int n)
    {
        int m=n,s=0;
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
