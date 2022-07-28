import java.util.Scanner;
public class AlternateSort1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        alternatesorting(a,n);
        printthearray(a,n);
        sc.close();
    }    
    static void printthearray(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    static void alternatesorting(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i%2==1)
                {
                    if(a[i]>a[j])
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
                else
                {
                    if(a[i]<a[j])
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
            }
        }
    }
}