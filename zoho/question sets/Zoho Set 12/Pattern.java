import java.util.Scanner;

public class Pattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printpattern(n);
        sc.close();
    }
    static void printpattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i==1||i==2)
            System.out.print("    ");
            int m=n,l=i;
            for(int j=i;j<=n;j++)
            {
                System.out.print(l+"   ");
                l=l+m;
                m--;
            }
            System.out.println();
        }
    }
}
