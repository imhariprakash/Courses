import java.util.Scanner;
public class CyclicNumber{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(iscyclic(n))
        System.out.println("Yes");
        else
        System.out.println("No");
        sc.close();
    }
    static boolean iscyclic(long n)
    {
        long num=n;
        long firsthalf,secondhalf;
        int digit=(int)num%10;
        int count=0;
        boolean all=true;
        while(num>0)
        {
            count++;
            if(num%10!=digit)
            all=false;
            num/=10;
        }
        if(all==true)
        return false;
        if(count%2==0)
        {
            firsthalf=num%(long)Math.pow(10,count/2);
            secondhalf=num/(long)Math.pow(10,count/2);
            if(firsthalf==secondhalf && iscyclic(firsthalf))
            return false;
        }
        num=n;
        while(true)
        {
            long rem=num%10;
            long div=num/10;
             num=(long)(Math.pow(10,count-1))*rem+div;
            if(num==n)
            break;
            if(num%n!=0)
            return false;
        }
        return true;
    }
}