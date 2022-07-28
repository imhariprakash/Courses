import java.util.Scanner;
public class NumberTocharacter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printthecharacter(n);
        sc.close();
    }
    static void printthecharacter(int n)
    {
        if(n==0)
        return;
            int k=n%26;
            if(k==0)
            {
                n=(n/26)-1;
                printthecharacter(n);
                System.out.print('Z');
            }
            else
            {
                n/=26;
                printthecharacter(n);
                System.out.print((char)(k+64));
            }
    }
}