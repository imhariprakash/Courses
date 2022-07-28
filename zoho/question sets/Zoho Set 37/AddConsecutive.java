import java.util.Scanner;
public class AddConsecutive {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i>0 && a[i]==a[i-1])
            {
                a[i-1]=a[i]+a[i-1];
                a[i]=0;
            }
        }
        arrange(a,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        sc.close();
    }
    static void arrange(int a[],int n)
    {
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                a[k]=a[i];
                if(k!=i)
                a[i]=0;
                k++;
            }
        }

    }
}
