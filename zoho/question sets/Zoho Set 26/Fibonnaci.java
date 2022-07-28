import java.util.Scanner;
public class Fibonnaci {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        fib(a,n);
        sc.close();
    }
    static void fib(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            if(checkfib(a[i]))
            System.out.print(a[i]);
        }
    }
    static boolean checkfib(int num)
    {
        int a=-1,b=1,c=0;
        while(num>c)
        {
            c=a+b;
            a=b;
            b=c;
            if(c==num)
            return true;
        }
        return false;
    }
}
