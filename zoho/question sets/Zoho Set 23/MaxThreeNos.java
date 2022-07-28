import java.util.Scanner;
public class MaxThreeNos{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(max(a,b,c));
        sc.close();
    }
    static int max(int a,int b,int c)
    {
        if(a>=b &&a>=c)
        return a;
        else if(b>=a && b>=c)
        return b;
        else if(c>=a && c>=b)
        return c;
        return -1;
    }
}