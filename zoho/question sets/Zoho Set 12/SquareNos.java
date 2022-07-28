import java.util.Scanner;
public class SquareNos{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        for(int i=(int)Math.sqrt(a)+1;i<=(int)Math.sqrt(b);i++)
        {
            System.out.println(i*i);
        }
        sc.close();
    }
}