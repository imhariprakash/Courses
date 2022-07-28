import java.util.Scanner;
public class RemoveUnbalancedParanthesis {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char a[]=new char[str.length()];
        for(int i=0;i<str.length();i++)
        a[i]=str.charAt(i);
        remove(a);
        sc.close();
    }
    static void remove(char a[])
    {
        int i=0,k=a.length,end=0;
        for(i=0;i<k;i++)
        {
            if(a[i]=='(')
            {
                end++;
                for(int e=end;e<a.length;e++)
                {
                    if(a[e]==')')
                    {
                        end=e;
                        break;
                    }
                }
                if(end>=k)
                {
                    for(int j=i;j<k-1;j++)
                    a[j]=a[j+1];
                    k--;
                    i--;
                }
                if(end<i)
                {
                    for(int j=end;j<k-1;j++)
                    a[j]=a[j+1];
                    k--;
                    i--;
                }
            }
            if(a[i]==')')
            {
                if(i>end ||i==0)
                {
                    for(int j=i;j<k-1;j++)
                    a[j]=a[j+1];
                    k--;
                    i--;
                }
            }
        }
        for(int l=0;l<k;l++)
        System.out.print(a[l]);
    }
}
