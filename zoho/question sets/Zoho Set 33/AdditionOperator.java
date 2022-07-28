import java.util.Scanner;
public class AdditionOperator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean t=true;
        while(t)
        {
            System.out.println("1.Add\n 2.Sub\n 3.Multiply\n 4.Division");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                    {
                        int a=sc.nextInt();
                        int b=sc.nextInt();
                        add(a,b);
                        break;
                    }
                case 2:
                {
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    sub(a,b);
                    break;
                }
                case 3:
                {
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    mult(a,b);
                    break;
                }
                case 4:
                {
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    if(b==0)
                    System.out.println("Enter NonZero value for divisor");
                    else
                    division(a,b);
                    break;
                }
                default :
                t=false;
                break;
            }
        }
        sc.close();
    }
    static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    static void sub(int a,int b)
    {
        b=flip(b);
        System.out.println(a+b);
    }
    static void mult(int a,int b)
    {
        int s=0;
        for(int i=0;i<Math.abs(b);i++)
        {
            s=s+a;
        }
        if(b<0)
        System.out.println(flip(s));
        else
        System.out.println(s);
    }
    static void division(int a,int b)
    {
        int q=0,
        dividend=a;
        if(a<0)
        dividend=flip(dividend);
        for(q=0;dividend>=Math.abs(b);q++)
        dividend=dividend-Math.abs(b);
        if((a<0 && b<0) ||(a>0 && b>0))
        System.out.println(q);
        else
        System.out.println(flip(q));

    }
    static int flip(int a)
    {
        int s=0;
        int t=a>1?-1:1;
        while(a!=0)
        {
            s=s+t;
            a=a+t;
        }
        return s;
    }
}
