import java.util.Scanner;
public class ExtraElement{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum1=0,sum2=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum1=sum1+a[i];
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
            sum2+=b[i];
        }
        int diff;
        if(n>m)
        {
            diff=sum1-sum2;
            System.out.println(diff+"--->"+index(a,diff));
        }
        else
        {
            diff=sum2-sum1;
            System.out.println(diff+"--->"+index(b,diff));
        }
        sc.close();
    }
    static int index(int a[],int d)
    {
        for(int i=0;i<a.length;i++)
        if(d==a[i])
        return i;
        return -1;
    }
}