import java.util.Scanner;
public class PreviousGreater{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        greater(a,n);
        sc.close();
    }
    static void greater(int a[],int n)
    {
        int max=a[0],f=0,prev=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            if(f==0)
            {
            System.out.print(max+" ");
            f=1;
            }
            if(max<a[i])
            {
                max=a[i];
                f=0;
            }
           /* if(max<a[i])
            max=a[i];
            if(max!=prev)
            System.out.println(max);
            prev=max;*/
        }
    }
}