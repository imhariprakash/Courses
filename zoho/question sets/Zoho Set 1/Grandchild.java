import java.util.Scanner;
public class Grandchild {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[][]=new String[n][2];
        for(int i=0;i<n;i++)
        {
            str[i][0]=sc.next();
            str[i][1]=sc.next();
        }
        String sub=sc.next();
        childcount(str,n,sub);
        sc.close();
    }    
    static void childcount(String str[][],int n,String sub)
    {
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(equal(str[i][1],sub))
            {
                c+=countchild(str,str[i][0],n);
            }
        }
        System.out.print(c);
    }
    static int countchild(String str[][],String sub,int n)
    {
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(equal(sub,str[i][1]))
            c++;
        }
        return c;
    }
    static boolean equal(String sub,String s)
    {
        int i=length(sub),j=length(s),k=0,l=0;
        if(i==j)
        {
            while(k<i && l<j)
            {
                if(sub.charAt(k)!=sub.charAt(l))
                return false;
                k++;l++;
            }
            if(k==i && l==j)
            return true;
        }
        return false;
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
}
