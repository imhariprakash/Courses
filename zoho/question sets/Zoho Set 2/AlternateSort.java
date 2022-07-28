import java.util.Scanner;
public class AlternateSort{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        sort(a,n);
        alternatesort(a,n);
        printthearray(a,n);
        sc.close();
    }
    static void sort(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
            }
        }
    }
    static void alternatesort(int a[],int n)
    {
        int i=1,j=n-1;
        while(i<=j)
        {
            int k=a[j];
            for(int s=j;s>i;s--)
            {
                a[s]=a[s-1];
            }
            a[i]=k;
            i=i+2;
        }
    }
    static void printthearray(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}