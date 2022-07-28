import java.util.Scanner;
public class Pattern1 {
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
            for(int j=n;j>0;j--)
            {
                if(j>i)
                {
                    System.out.print("  ");
                }
                else{
                    System.out.printf(j+" ");
                }
            }
            System.out.println();
        }
    }
}
