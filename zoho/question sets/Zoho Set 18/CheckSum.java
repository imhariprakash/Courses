import java.util.Scanner;
public class CheckSum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int sum=sc.nextInt();
        if(checktwosum(a,n,sum))
        System.out.print("true");
        else
        System.out.print("false");
        sc.close();
    }    
    static boolean checktwosum(int a[],int n,int sum)
    {
        int i=0,j=n-1;
        while(i<j)
        {
            if(a[i]+a[j]==sum)
                return true;
            else if(a[i]+a[j]>sum)
                j--;
            else if(a[i]+a[j]<sum)
            i++;
        }
        return false;
    }
}
