import java.util.Scanner;
public class Expression31 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=length(str);
        evaluate(str,n);
    }    
    static int length(String str)
    {
        int i=0;
        while(true)
        {
            try{
                str.charAt(i);
                i++;
            }
            catch(Exception e)
            {
                return i;
            }
        }
    }
    static void evaluate(String str,int n)
    {
        int i=(n/2)+1;
        System.out.print( evaluteexp(str,i,n));
    }
    static int evaluteexp(String str,int exp,int n)
    {
        int a=0;
        if(str.charAt(0)>=48 && str.charAt(0)<=57)
        a=str.charAt(0)-48;
        for(int i=1;i<exp && exp<n;i++,exp++)
        {
            a=evaluateexp(a,str.charAt(i)-48,str.charAt(exp));
        }
        return a;
    }
    static int evaluateexp(int a,int b,char e)
    {
        switch(e)
        {
            case '+':
            return (a+b);
            case '-':
            return (a-b);
            case '*':
            return (a*b);
            case '/':
            return (a/b);
            default :
            return 0;
        }
    }
}