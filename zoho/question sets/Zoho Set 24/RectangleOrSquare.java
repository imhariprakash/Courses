import java.util.Scanner;
public class RectangleOrSquare{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(check(a,b,c,d));
        else
        System.out.println("None");
        sc.close();
    }
    static boolean check(int a,int b,int c,int d)
    {
        if(a==b && b==c && c==d)
        {
            System.out.println("Square");
            return true;
        }
        else if((a==b && c==d) ||(a==c && b==d) ||(a==d && b==c))
        {
            System.out.println("Rectangle");
            return true;
        }
        else 
        return false;
    }
}