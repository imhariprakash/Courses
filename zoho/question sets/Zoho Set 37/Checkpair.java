import java.util.Scanner;
public class Checkpair {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int s=sc.nextInt();
        pair(a,n,s);
        sc.close();
    }
    static void pair(int a[],int n,int s)
    {
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==s)
                {
                    System.out.println("("+a[i]+","+a[j]+")");
                    c++;
                }
            }
        }
        System.out.println("count = "+c);
    }
}
