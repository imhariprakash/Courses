import java.util.Scanner;
import java.lang.Math;
public class MinSumOfSquares {
    static int count=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(minisquare(n));
        sc.close();
    }
    static int minisquare(int n)
    {
        if(n<3)
        return n;
        int s=(int)Math.sqrt(n),c=0;
        while(c!=n)
        {
            c=c+(s*s);
            if(c>n)
            {
                c=c-(s*s);
                s--;
            }
            else
                count++;
        }
        return count;
    }
}
