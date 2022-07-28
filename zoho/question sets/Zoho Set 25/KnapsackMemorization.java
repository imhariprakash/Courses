import java.util.Scanner;
public class KnapsackMemorization {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int value[]=new int[n];
        int weight[]=new int[n];
        for(int i=0;i<n;i++)
        value[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        weight[i]=sc.nextInt();
        int w=sc.nextInt();
        int dp[][]=new int[n+1][w+1];
        for(int i=0;i<n+1;i++)
        for(int j=0;j<w+1;j++)
        dp[i][j]=-1;
        System.out.println(knapsack(weight,value,w,n,dp));
        sc.close();
    }
    static int knapsack(int we[],int v[],int w,int n,int dp[][])
    {
        if(w==0||n==0)
        return 0;
        if(dp[n][w]!=-1)
        return dp[n][w];
        if(w<we[n-1])
        return dp[n][w]=knapsack(we,v,w,n-1,dp);
        else
        return dp[n][w]=max(knapsack(we,v,w-we[n-1],n-1,dp)+v[n-1],knapsack(we,v,w,n-1,dp));
    }
    static int max(int a,int b)
    {
        return (a>b?a:b);
    }
}
