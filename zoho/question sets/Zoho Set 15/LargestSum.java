import java.util.Scanner;
public class LargestSum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        largesum(a,n);
        sc.close();
    }    
    static void largesum(int a[],int n)
    {
        int maxend=0,maxsofar=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=0)
            maxend+=a[i];
            else maxend=0;
            if(maxsofar<maxend)
            {
                maxsofar=maxend;
            }
            if(maxend<0)
            maxend=0;
        }
        System.out.print(maxsofar);
    }
}
