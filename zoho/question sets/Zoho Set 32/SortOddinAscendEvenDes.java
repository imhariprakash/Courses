import java.util.Scanner;
public class SortOddinAscendEvenDes {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        sortoddeven(a,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        sc.close();
    }
    static void sortoddeven(int a[],int n)
    {
        int l=0,r=n-1;
        while(l<=r)
        {
            if(a[l]%2==1 && a[r]%2==0)
            {
                l++;
                r--;
            }
            else if(a[l]%2==1 &&a[r]%2!=0)
            l++;
            else if(a[l]%2!=1 && a[r]%2==0)
            r--;
            else
            a[l]=a[l]+a[r]-(a[r]=a[l]);
        }
        sort(a,0,l,1);
        sort(a,l+1,n,0);
    }
    static void sort(int a[],int i,int j,int f)
    {
        for(int k=i;k<j;k++)
        {
            for(int l=k+1;l<j;l++)
            {
                if(f==1 && a[k]>a[l])
                a[k]=a[k]+a[l]-(a[l]=a[k]);
                if(f==0 && a[k]<a[l])
                a[k]=a[k]+a[l]-(a[l]=a[k]);
            }
        }
    }
}
