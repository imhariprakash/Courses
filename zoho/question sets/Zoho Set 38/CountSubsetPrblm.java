import java.util.Scanner;
public class CountSubsetPrblm {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int s=sc.nextInt();
       System.out.println(count(a,n,s));
       sc.close();
    }
    static int count(int a[],int n,int s)
    {
        if(s==0)
        return 1;
        if(n==0)
        return 0;
        if(a[n-1]>s)
        return(count(a,n-1,s));
        else
        return (count(a,n-1,s)+count(a,n-1,s-a[n-1]));
    }
}

