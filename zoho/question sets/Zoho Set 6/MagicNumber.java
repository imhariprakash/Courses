import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sum(n);
        int rev=rev(sum);
        if(n==sum*rev)
        System.out.println("Magic Number");
        else
        System.out.println("Not Magic Number");
        sc.close();
    }
    static int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            s=s+(n%10);
            n=n/10;
        }
        return s;
    }
    static int rev(int n)
    {
        int s=0;
        while(n>0)
        {
            s=s*10+(n%10);
            n=n/10;
        }
        return s;
    }
}
