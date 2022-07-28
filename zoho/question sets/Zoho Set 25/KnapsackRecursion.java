import java.util.Scanner;
public class KnapsackRecursion {
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
        System.out.println(knapsack(weight,value,w,n-1));
        sc.close();
    }   
    static int  knapsack(int we[],int v[],int w,int n)
    {
        if(n==0||w==0)
        return 0;
        if(w<we[n])
        return(knapsack(we,v,w,n-1));
        else
        return max((knapsack(we,v,w-we[n],n-1)+v[n]),knapsack(we,v,w,n-1));
    } 
    static int max(int a,int b)
    {

        return (a>b?a:b);
    }
}
