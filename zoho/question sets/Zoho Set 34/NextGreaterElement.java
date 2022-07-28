import java.util.Scanner;
public class NextGreaterElement {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        next(a,n);
        sc.close();
    }
    static void next(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int max=Integer.MAX_VALUE;
            for(int j=0;j<n;j++)
            {
                if(a[i]<a[j] && a[j]<max)
                max=a[j];
            }
            if(max==Integer.MAX_VALUE)
            System.out.print("_ ");
            else
            System.out.print(max+" ");
        }
    }
}
