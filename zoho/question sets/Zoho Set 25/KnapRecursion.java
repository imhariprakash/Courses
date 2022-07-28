import java.util.Scanner;
public class KnapRecursion {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v[]=new int[n];
        int we[]=new int[n];
        for(int i=0;i<n;i++)
        v[i]=sc.nextInt();
        for(int j=0;j<n;j++)
        we[j]=sc.nextInt();
        int w=sc.nextInt();
        System.out.println(knap(we,v,w,n-1));
    }    
    static int knap(int we[],int v[],int w,int n)
    {
        if(n==0||w==0)
        return 0;
        else if(w<we[n])
        return knap(we,v,w,n-1);
        else
        return max(knap(we,v,w-we[n],n-1)+v[n],knap(we,v,w,n-1));
    }
    static int max(int a,int b)
    {
        return (a>b?a:b);
    }
}
