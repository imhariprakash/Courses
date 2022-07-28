import java.util.Scanner;
public class SecondMax {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        if(second(a,n));
        else
            System.out.println("No second Maximum");
        sc.close();
    }
    static boolean second(int a[],int n)
    {
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(first<a[i])
            {
                second=first;
                first=a[i];
            }
            else if(second<a[i] && first!=a[i])
                second=a[i];
        }
        if(second!=Integer.MIN_VALUE)
        {
        System.out.println(second);
        return true;
        }
        else return false;
    }
}
