import java.util.Scanner;
public class ReplaceGreaterelementinRight{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        replace(a,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        sc.close();
    }
    static void replace(int a[],int n)
    {
        int max=-1;
        for(int i=n-1;i>=0;i--)
        {
            int prev=max;
            if(max<a[i])
            max=a[i];
            a[i]=prev;
        }
    }
}