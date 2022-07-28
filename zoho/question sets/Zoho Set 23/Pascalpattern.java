import java.util.Scanner;
public class Pascalpattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pascal(n);
        sc.close();
    }
    static void pascal(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-i-1;k++)
            System.out.print("*");
            int c=1;
            for(int j=0;j<=i;j++)
            {
                if(i==0 || j==0)
                c=1;
                else
                c=c*(i-j+1)/j;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
