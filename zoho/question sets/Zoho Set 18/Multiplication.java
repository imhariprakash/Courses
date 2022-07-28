import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        multiplication(a,b);
        sc.close();
    }    
    static void multiplication(int a,int b)
    {
        int f=0,l=0;
        if(a>0 && b>0)
        {
            if(a<b)
            a=a+b-(b=a);
        }
        else if(a<0)
        {
            if(b<0)
            {
                a=flip(a);b=flip(b);
                if(a<b)
                a=a+b-(b=a);
            }
            else
            {
                a=flip(a);
                if(a<b)
                a=a+b-(b=a);
                f=1;
            }
        }
        else
        {
            b=flip(b);
            if(a<b)
            a=a+b-(b=a);
            f=1;
        }
        for(int i=1;i<=b;i++)
        {
            l=l+a;
        }
        if(f==1)
        System.out.print(flip(l));
        else
        System.out.print(l);
    }
    static int flip(int a)
    {
        int t=0;
        while(a!=0)
        {
            t++;
            a++;
        }
        return t;
    }
}
