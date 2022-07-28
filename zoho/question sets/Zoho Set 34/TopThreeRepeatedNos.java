import java.util.Scanner;
public class TopThreeRepeatedNos {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(max<a[i])
            max=a[i];
        }
        int f[]=new int[n];
        max++;
        topfreq(a,f,max,n);
        sc.close();
    }
    static void topfreq(int a[],int f[],int max,int n)
    {
        int c=0,k=0;
        for(int i=0;i<n;i++)
        {
            c=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j] && a[j]!=max)
                {
                    c++;
                    a[j]=max;
                }
            }
            f[k++]=c;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(f[i]>f[j])
                {
                    f[i]=f[i]+f[j]-(f[j]=f[i]);
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
            }
        }
        int l=0;
        for(int i=0;i<k;i++)
        {
            if(a[i]!=max)
            {
                System.out.println(a[i]+"--->"+f[i]);
                l++;
            }
            if(l==3)
            break;
        }
    }
}
