import java.util.Scanner;
public class union {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int l=0;
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            int f=0;
            for(int j=0;j<i;j++)
            {
                if(k==a[j])
                f=1;
            }
            if(f==0)
            a[l++]=k;
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        b[i]=sc.nextInt();
        l=unionoftwomatrix(a,l,b,b.length);
        for(int i=0;i<l;i++)
        System.out.print(a[i]+" ");
        sc.close();
    }
    static int unionoftwomatrix(int a[],int l,int b[],int m)
    {
        for(int i=0;i<m;i++)
        {
            int f=0;
            for(int j=0;j<l;j++)
            {
                if(b[i]==a[j])
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            a[l++]=b[i];
        }
        return l;
    }
}
