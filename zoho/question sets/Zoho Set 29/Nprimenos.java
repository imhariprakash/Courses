import java.util.Scanner;
public class Nprimenos{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);
        sc.close();
    }
    static void prime(int n)
    {
        for(int i=2;i<n;i++)
        {
            int f=1;
            for(int j=2;j<=(int)Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    f=0;
                    break;
                }
            }
            if(f==1)
            System.out.print(i+" ");
        }
    }
}