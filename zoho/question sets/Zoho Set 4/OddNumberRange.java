import java.util.Scanner;
public class OddNumberRange{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        oddrange(a,b);
        sc.close();
    }
    static void oddrange(int a,int b)
    {
        for(int i=a;i<b;i++)
        {
            if(i%2!=0)
            System.out.print(i+" ");
        }
    }
}