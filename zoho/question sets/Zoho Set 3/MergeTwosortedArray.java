import java.util.Scanner;

public class MergeTwosortedArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int i;
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int j=0;j<m;j++)
        b[j]=sc.nextInt();
        for(int j=0;j<b.length;j++)
        {
            for(i=0;i<n;i++)
            {
                if(b[j]<a[i])
                    a[i]=a[i]+b[j]-(b[j]=a[i]);
            }
                a[i]=b[j];
                n++;
        }
        int c=0;
        for(int j=0;j<n-1;j++)
        {
            if(a[j]==a[j+1])
                c++;
            else if(c!=0)
            {
                delete(a,j-c,j);
                n=n-c;
                c=0;
                j=-1;
            }
        }
        if(c!=0)
        n=n-c-1;
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j]+" ");
        }
        sc.close();
    }
    static void delete(int a[],int i,int j)
    {
        for(int k=i;k<a.length;k++)
        {
            if(j!=a.length-1)
            {
            a[k]=a[j];
            j++;
            }
            else
            break;
        }
    }
}
