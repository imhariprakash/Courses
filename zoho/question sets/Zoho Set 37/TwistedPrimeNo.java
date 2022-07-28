import java.util.Scanner;
public class TwistedPrimeNo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(prime(n) && prime(rev(n)))
        System.out.println("Twisted prime");
        else
        System.out.println("Not Twisted prime");
        sc.close();
    }
    static boolean prime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    static int rev(int n)
    {
        int s=0;
        while(n>0)
        {
            s=s*10+n%10;
            n/=10;
        }
        return s;
    }
}
