import java.util.Scanner;
public class BinaryPattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
        sc.close();
    }
    static void pattern(int n)
    {
        int c=times(n);
        int i=0;
        while(i<c)
        {
            int p[]=new int[n];
            int m=i,k=n-1;
            while(m>0)
            {
                p[k]=m%2;
                m=m/2;
                k--;
            }
            for(int l=0;l<n;l++)
            System.out.print(p[l]+" ");
            System.out.println();
            i++;
        }
    }
    static int times(int n)
    {
        int s=1;
        while(n>0)
        {
            s=s*2;
            n--;
        }
        return s;
    }
}
