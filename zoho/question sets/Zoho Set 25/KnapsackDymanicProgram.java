import java.util.Scanner;
public class KnapsackDymanicProgram {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int weight[]=new int[n];
        int value[]=new int[n];
        for(int i=0;i<n;i++)
        value[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        weight[i]=sc.nextInt();
        int w=sc.nextInt();
        int dp[][]=new int[n+1][w+1];
        System.out.println(knapsack(weight,value,w,n,dp));
        sc.close();
    }
    static int knapsack(int we[],int v[],int w,int n,int dp[][])
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=w;j++)
            {
                if(i==0 || j==0)
                dp[i][j]=0;
                else if(we[i-1]>j)
                dp[i][j]=dp[i-1][j];
                else
                dp[i][j]=max(dp[i-1][j],v[i-1]+dp[i-1][j-we[i-1]]);
            }
        }
        return dp[n][w];
    }
    static int max(int a,int b)
    {
        return (a>b?a:b);
    }
}
