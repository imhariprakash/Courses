import java.util.Scanner;
public class Frequency {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int f[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        count(a,f,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        sc.close();
    }
    static void count(int a[],int f[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                f[j]++;
            }
        }
        sort(a,f,n);
    }
    static void sort(int a[],int f[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(f[i]<f[j])
                {
                    f[i]=f[i]+f[j]-(f[j]=f[i]);
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
                else if(f[i]==f[j] && a[i]>a[j])
                {
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
            }
        }
    }
}
