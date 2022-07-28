import java.util.Scanner;
public class MiddlePattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=length(str);
        pat(str,n);
        sc.close();
    }
    static int length(String str)
    {
        int i=0;
        while(true)
        {
            try{
                str.charAt(i);
                i++;
            }
            catch(Exception e)
            {
                return i;
            }
        }
    }
    static void pat(String str,int n)
    {
        for(int i=0;i<n;i++)
        {
            int m=n/2;
            for(int j=0;j<n;j++)
            {
                if(j<n-i-1)
                System.out.print(" ");
                else
                {
                    if(m<n)
                    System.out.print(str.charAt(m++));
                    else
                    {
                        System.out.print(str.charAt(m-n));
                        m++;
                    }
                }
            }
            System.out.println();
        }
    }
}
