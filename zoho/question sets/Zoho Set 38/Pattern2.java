import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n+i;j++)
            {
                if(j<=n)
                System.out.printf("%-3d",j);
                else
                System.out.printf("%-3d",j-n);
            }
            System.out.println();
        }
    }
}
