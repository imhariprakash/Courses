import java.util.Scanner;
public class FriendsNetwork {
    public static void main(String[] ars)
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[100];
        String b[]=new String[100];
        int n=sc.nextInt();
        int j=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
            int c=sc.nextInt();
            while(c>0)
            {
                String str=sc.next();
                int f=0;
                for(int k=0;k<j;k++)
                {
                    if(equal(str,b[k]))
                    f=1;
                }
                if(f==0)
                b[j++]=str;
                c--;
            }
        }
        sc.close();
        check(a,n,b,j);
    }
    static void check(String a[],int n,String b[],int l)
    {
        for(int i=0;i<l;i++)
        {
            int f=1;
            for(int j=0;j<n;j++)
            {
                if(equal(a[j],b[i]))
                {
                    f=0;
                }
            }
            if(f!=0)
            System.out.print(b[i]+" ");
        }
    }
    static boolean equal(String a,String b)
    {
        if(a.length()!=b.length())
        return false;
        int i=0;
        while(i<a.length())
        {
            if(a.charAt(i)!=b.charAt(i))
            return false;
            i++;
        }
        return true;    
    }
}
