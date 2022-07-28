import java.util.Scanner;
public class MergeTwoSortedArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        b[i]=sc.nextInt();
        int c[]=new int[n+m];
        int l=merge(a,n,b,m,c);
        for(int i=0;i<l;i++)
        System.out.print(c[i]+" ");
        sc.close();
    }    
    static int merge(int a[],int n,int b[],int m,int c[])
    {
        int i=0,j=0,k=0;
        while(i<n || j<m)
        {
            if(i<n && j<m)
            {
                if(a[i]<b[j])
                {
                    if((k>0 && c[k-1]!=a[i])||k==0)
                    c[k++]=a[i];
                    i++;
                }
                else if(a[i]>b[j])
                {
                    if((k>0 && c[k-1]!=b[j])||k==0)
                    c[k++]=b[j];
                    j++;
                }
                else
                {
                    if((k>0 && c[k-1]!=a[i])||k==0)
                    c[k++]=a[i];
                    i++;
                    j++;
                }
            }
            else if(i<n)
            {
                if((k>0 && c[k-1]!=a[i])||k==0)
                c[k++]=a[i];
                i++;
            }
            else
            {
                if((k>0 && c[k-1]!=b[j])||k==0)
                c[k++]=b[j];
                j++;
            }
        }
        return k;
    }
}
