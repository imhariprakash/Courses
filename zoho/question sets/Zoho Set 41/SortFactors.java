import java.util.Scanner;
public class SortFactors{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        factorssort(a,n);
        for(int i=0;i<n;i++)
            System.out.println(a[i]+" ");
        sc.close();
    }
    static void factorssort(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(factors(a[j])<factors(a[j+1]))
                a[j]=a[j]+a[j+1]-(a[j+1]=a[j]);
            }
        }
    }
    static int factors(int a)
    {
        int c=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            c++;
        }
        return c;
    }
}