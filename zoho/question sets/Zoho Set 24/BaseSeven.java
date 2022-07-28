import java.util.Scanner;
public class BaseSeven {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(base7(n));
        sc.close();
    }
    static long base7(long n)
    {
        long s=0,d=1;
        while(n>0)
        {
            long k=n%7;
            s=s+k*d;
            n/=7;
            d=d*10;
        }
        return s;
    }
}
