import java.util.Scanner;
public class PrimeNumber {
    static int max=Integer.MIN_VALUE;
    static int c=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int a[]=new int[n.length()];
        for(int i=0;i<n.length();i++)
            a[i]=n.charAt(i)-48;
        permutate(a,0,n.length());
        System.out.println(max==Integer.MIN_VALUE?-1:max);
        sc.close();
    }
    static void permutate(int a[],int l,int r)
    {
        if(l==r)
        {
            if(prime(convert(a)) && convert(a)>max)
                max=convert(a);
            return;
        }
        for(int i=l;i<a.length;i++)
        {
            swap(a,i,l);
            permutate(a,l+1,r);
            swap(a,i,l);
        }
    }
    static int convert(int a[])
    {
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s=s*10+a[i];
        }
        return s;
    }
    static boolean prime(int n)
    {
        for(int i=2;i<(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    static void swap(int a[],int i,int j)
    {
        a[i]=a[i]+a[j]-(a[j]=a[i]);
    }
}
