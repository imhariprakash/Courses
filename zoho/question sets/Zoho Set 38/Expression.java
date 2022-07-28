import java.util.Scanner;
public class Expression {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++)
            s[i]=sc.next();
        evaluate(s,n);
        System.out.println();
        for(int i=0;i<n;i++)
        System.out.println(s[i]);
        sc.close();
    }
    static void evaluate(String s[],int n)
    {
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<n-i-1;j++)
            {
                if(evaluatestr(s[j])>evaluatestr(s[j+1]))
                {
                    String str=s[j];
                    s[j]=s[j+1];
                    s[j+1]=str;
                }
            }
        }
    }
    static int evaluatestr(String str)
    {
        int f=0,num=0,n1=0,n2;
        char op=' ';
        for(int i=0;i<str.length();i++)
        {
            if(!(str.charAt(i)>='0'&& str.charAt(i)<='9'))
            {   
                f++;
                if(f==1)
                {
                    n1=num;
                    if(str.charAt(i)=='!')
                    {
                        n1=fact(n1);
                        num=n1;
                        f--;
                        continue;
                    }
                    op=str.charAt(i);
                }
                if(f==2)
                {
                    n2=num;
                    if(str.charAt(i)=='!')
                    {
                        n2=fact(n2);
                        num=n2;
                        f--;
                        continue;
                    }
                    n1=perform(n1,n2,op);
                    op=str.charAt(i);
                    f--;
                }
                num=0;
            }
            else
            num=num*10+str.charAt(i)-48;
        }
        if(f==0)
        return num;
        else
        n1=perform(n1,num,op);
        return n1;
    }
    static int perform(int n1,int n2,char op)
    {
        int n=0;
        switch(op)
        {
            case '+':
            {
                n=n1+n2;
                break;
            }
            case '-':
            {
                n=n1-n2;
                break;
            }
            case '*':
            {
                n=n1*n2;
                break;
            }
            case '/':
            {
                n=n1/n2;
                break;
            }
            case '^':
            {
                n=(int)Math.pow(n1,n2);
            }
        }
        return n;
    }
    static int fact(int n)
    {
        if(n==0)
        return 1;
        return (n*fact(n-1));
    }
}
