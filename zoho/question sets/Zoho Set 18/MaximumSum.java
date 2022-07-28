import java.util.Scanner;
public class MaximumSum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        max(a,n);
        sc.close();
    }
    static void max(int a[],int n)
    {
        int maxsofar=Integer.MIN_VALUE,maxend=0;
        for(int i=0;i<n;i++)
        {
            maxend+=a[i];
            if(maxsofar<maxend)
             maxsofar =maxend;
             if (maxend<0)
             maxend=0;
        }
        System.out.println(maxsofar);
    }
}
