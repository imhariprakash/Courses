import java.util.Scanner;
public class Equilibriumindex {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println(equalindex(a,n,sum));
        sc.close();
    }
    static int equalindex(int a[],int n,int sum)
    {
        int s=0;
        for(int i=0;i<n;i++)
        {
            sum-=a[i];
            if(sum==s)
            return i;
            s=s+a[i];
        }
        return -1;
    }
}
