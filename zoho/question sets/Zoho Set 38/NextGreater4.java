import java.util.Scanner;
public class NextGreater4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        nextgreater(a,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }    
    static void nextgreater(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int max=Integer.MAX_VALUE;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j] && max>a[j])
                max=a[j];
            }
            if(max!=Integer.MAX_VALUE)
            a[i]=max;
            else
            a[i]=-1;
        }
    }
}
