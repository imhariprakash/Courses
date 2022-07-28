import java.util.Scanner;
public class Kadens {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        max(a,n);
        sc.close();
    }
    static void max(int a[],int n)
    {
        int maxendhere=Integer.MIN_VALUE;
        int maxsofar=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            maxendhere+=a[i];
            if(maxsofar<maxendhere)
            {
                maxsofar=maxendhere;
            }
            if(maxendhere<=0)
            maxendhere=0;
        }
        System.out.println(maxsofar);
    }
}
