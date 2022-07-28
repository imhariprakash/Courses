import java.util.Scanner;
public class Factors {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        check(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+"--->"+fact(a[i]));
        }
        sc.close();
    }
    static void check(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(fact(a[j])<fact(a[j+1]))
                a[j]=a[j]+a[j+1]-(a[j+1]=a[j]);
            }
        }
    }
    static int fact(int i)
    {
        int c=0;
        for(int j=1;j<i;j++)
        if(i%j==0)
        c++;
        return c;
    }
}
