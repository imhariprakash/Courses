import java.util.Scanner;
public class SumOneither {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s+=a[i];
        }
        System.out.println(a[sumeither(a,s,n)]);
        sc.close();
    }
    static int sumeither(int a[],int s,int n)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            s=s-a[i];
            if(s==sum)
                return i;
            sum+=a[i];
        }
        return -1;
    }
}
