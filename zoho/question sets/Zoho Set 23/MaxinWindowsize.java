import java.util.Scanner;
public class MaxinWindowsize {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int window=sc.nextInt();
        printthewindowelement(a,n,window);
        sc.close();
    }
    static void printthewindowelement(int a[],int n,int w)
    {
        for(int i=0;i<n-w+1;i++)
        {
            int min=Integer.MIN_VALUE;
            for(int j=i;j<i+w;j++)
            {
                if(a[j]>min)
                min=a[j];
            }
            System.out.print(min+" ");
        }
    }
}
