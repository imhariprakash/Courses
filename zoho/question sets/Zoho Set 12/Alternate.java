import java.util.Scanner;
public class Alternate {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        sort(a);
        alternatesort(a);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        sc.close();
    }
    static void sort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                    swap(a,i,j);
            }
        }
    }
    static void swap(int a[],int i,int j)
    {
        a[i]=a[i]+a[j]-(a[j]=a[i]);
    }
    static void alternatesort(int a[])
    {
        int i=1,j=a.length-1;
        while(i<j)
        {
            int k=a[j];
            for(int l=j;l>i;l--)
                a[l]=a[l-1];
            a[i]=k;
            i=i+2;
        }
    }
}
