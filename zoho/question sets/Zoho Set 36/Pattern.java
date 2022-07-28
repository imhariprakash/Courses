import java.util.Scanner;
public class Pattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pat(n);
        sc.close();
    }
    static void pat(int n)
    {
        int s=1,k=1,m=s;
        for(int i=0;i<2*n;i++)
        {
            if(i<n)
            {
            s=m;
            for(int j=0;j<n;j++)
            {
                if(i+j<n-1)
                System.out.print(" ");
                else
                {
                System.out.print(s+" ");
                s--;
                }
            }
            k++;
            m=m+k;
            System.out.println();
           }
        else{
            if(i==n)
            m=m-k;
            s=m;
            for(int j=0;j<n;j++)
            {
                if(j<i-n)
                System.out.print(" ");
                else
                {
                System.out.print(s+" ");
                s--;
                }
            }
            k--;
            m=m-k;
            System.out.println();
            }
        }
    }
}
