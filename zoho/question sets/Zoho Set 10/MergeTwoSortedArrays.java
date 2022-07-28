import java.util.Scanner;
public class MergeTwoSortedArrays
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int j=0;j<m;j++)
        b[j]=sc.nextInt();
        n=merge(a,b,n,m);
        n=removedublicates(a,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        sc.close();
    }
    static int merge(int a[],int b[],int n,int m)
    {
        int j,i;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[j]>b[i])
                a[j]=a[j]+b[i]-(b[i]=a[j]);
            }
            a[j]=b[i];
            n++;
        }
        return n;
    }
    static int removedublicates(int a[],int n)
    {
        int c=0,i;
        for(i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
            c++;
            else if(c!=0)
            {
                    remove(a,i-c,i,n);
                    n=n-c;
                    i=-1;
                    c=0;
            }
        }
        if(c!=0)
        n=n-c-1;
        return n;
    }
    static void remove(int a[],int i,int j,int len)
    {
        for(int k=i;k<len;k++)
        {
            if(j!=len)
            {
            a[k]=a[j];
            j++;
            }
            else
            break;
        }
    }
}