import java.util.Scanner;
public class CountSubset {
    static int c=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int h1=sc.nextInt();
        int h2=sc.nextInt();
        int b=sc.nextInt();
        sort(a);
        findcombo(a,b,n,h1,h2);
        sc.close();
    }
    static void findcombo(int a[],int b,int n,int h1,int h2)
    {
        int d[]=new int[b];
        combination(a,d,0,a.length,0,b,0,h1,h2);
    }
    static void combination(int a[],int d[],int start,int end,int index,int r,int s,int h1,int h2)
    {
        if(index==r)
        {
            if(h1==s)
            {
                if(check(d,a,h2))
                {
                    for(int i=0;i<d.length;i++)
                    System.out.print(d[i]+" ");
                    System.out.print("& ");
                    printremaining(d,a);
                }
            }
            return;
        }
        for(int k=start;k<end && k-end<=r-index ;k++)
        {
            d[index]=a[k];
            combination(a,d,k+1,a.length,index+1,r,s+d[index],h1,h2);
        }
    }
    static boolean check(int d[],int a[],int h)
    {
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            int f=0;
            for(int j=0;j<d.length;j++)
            {
                if(a[i]==d[j])
                f=1;
            }
            if(f==0)
            s=s+a[i];
        }
        if(s==h)
        return true;
        return false;
    }
    static void printremaining(int d[],int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int f=0;
            for(int j=0;j<d.length;j++)
            {
                if(a[i]==d[j])
                f=1;
            }
            if(f==0)
            System.out.print(a[i]+" ");
        }
    }
    static void sort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                a[i]=a[i]+a[j]-(a[j]=a[i]);
            }
        }
    }
}
