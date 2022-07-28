import java.util.Scanner;
public class InsertZeroConsecutive {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int k=sc.nextInt();
        n=insert(a,n,k);
        printtheArray(a,n);
        sc.close();
    }
    static int insert(int a[],int n,int k)
    {
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            c++;
            else
            c=0;
            if(c==k)
            {
                n++;
                for(int j=n;j>i;j--)
                {
                    a[j]=a[j-1];
                }
                a[i+1]=0;
            }
        }
        return n;
    }
    static void printtheArray(int a[],int n)
    {
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}
