import java.util.Scanner;
public class WaveArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        sortwave(a,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        sc.close();
    }
    static void sortwave(int a[],int n)
    {
        for(int i=0;i<n;i=i+2)
        {
            if(i>0 && a[i]<a[i-1])
            a[i]=a[i]+a[i-1]-(a[i-1]=a[i]);
            
            if(i<n-1 && a[i]<a[i+1])
            a[i]=a[i]+a[i+1]-(a[i+1]=a[i]);
        }
    }
}
