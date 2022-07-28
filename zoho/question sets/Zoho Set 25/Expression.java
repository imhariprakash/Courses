public class Expression {
    public static void main(String[] args)
    {
        String str="4!+30";
        evalute(str);
    }
    static void evalute(String s)
    {
        int i=0,j,num=0,n=0;char op=' ';
        while((s.charAt(i)>='0' &&s.charAt(i)<='9'))
        {
            num=num*10+s.charAt(i)-48;
            i++;
        }
        if(s.charAt(i)=='!')
        {
            num=fact(num);
            if(i<s.length()-1)
            i++;
        }
        op=operand(i,s);
        for(j=i+1;j<s.length();j++)
        {
            if(s.charAt(j)>='0' && s.charAt(j)<='9')
            {
                n=n*10+s.charAt(j)-48;
            }
            else
            {
                if(s.charAt(j)=='!')
                {
                    n=fact(n);
                    if(j<s.length()-1)
                        j++;
                }
                num=operation(num,n,op);
                n=0;
                op=operand(j,s);
            }
        }
        if(s.charAt(s.length()-1)!='!')
        num=operation(num,n,op);
        System.out.println(num);
    }
    static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        f=f*i;
        return f;
    }
    static int operation(int n,int m,char op)
    {
        if(op=='+')
        n=n+m;
        else if(op=='-')
        n=n-m;
        else if(op=='/')
        n=n/m;
        else if(op=='*')
        n=n*m;
        return n;
    }
    static char operand(int j,String s)
    {
        char op=' ';
        if(s.charAt(j)=='+')
        op='+';
        else if(s.charAt(j)=='-')
        op='-';
        else if(s.charAt(j)=='*')
        op='*';
        else if(s.charAt(j)=='/')
        op='/';
        return op;
    }
}
