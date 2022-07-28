import java.util.Scanner;
public class Diamondpattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
        sc.close();
    }
    static void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j<n-i-1)
                System.out.print(" ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j<i)
                System.out.print(" ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
