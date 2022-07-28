import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int form=sc.nextInt();
        System.out.println(binadd(a,b,form));
        sc.close();
    }
    static int binadd(int a,int b,int f)
    {
        int c=0,s=0,d=1;
        while(a>0 || b>0)
        {
            s=s+d*((a%10+b%10+c%10)%f);
            d=d*10;
            c=(a%10+b%10+c%10)/f;
            a=a/10;
            b=b/10;
        }
        if(c!=0)
        s=s+d*c;
        return s;
    }
}
