import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
        sc.close();
    }
    static void pattern(int n)
    {
        for(int i=0;i<2*n;i++)
        {
            if(i<n)
            {
                for(int j=0;j<n;j++)
                {
                    if(i+j<n-1)
                    {
                        System.out.print(" ");
                    }
                    else
                    System.out.print("* ");
                }
                System.out.println();
            }
            if(i>n)
            {
                for(int j=0;j<n;j++)
                {
                    if(j<i-n)
                    System.out.print(" ");
                    else
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
