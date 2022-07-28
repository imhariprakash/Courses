import java.util.Scanner;
public class RemoveZero {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(remove(a+b)==remove(a)+remove(b))
        System.out.println("True");
        else
        System.out.println("False");
        sc.close();
    }
    static int remove(int n)
    {
        int s=0;
        while(n>0)
        {
            int d=1;
            if(n%10!=0)
            {
                s=s+(n%10)*d;
                d=d*10;
            }
            n=n/10;
        }
        return s;
    }
}
