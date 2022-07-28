import java.util.Scanner;
public class MismatchedOnes {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String sub=sc.next();
        if(str.length()!=sub.length())
        {
            System.out.println("Enter equal length string");
        }
        else
        missedchar(str,sub);
        sc.close();
    } 
    static void missedchar(String str,String sub)
    {
        int i,c=0;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=sub.charAt(i))
            {
                c++;
            }
            else if(c!=0)
            {
                printthechar(str,i-c,i-1);
                System.out.print(" , ");
                printthechar(sub,i-c,i-1);
                System.out.println();
                c=0;
            }
        }
        if(c!=0)
        {
            printthechar(str,c-i,i-1);
            System.out.print(" , ");
            printthechar(sub,c-i,i-1);
            System.out.println();
        }
    }
    static void printthechar(String str,int i,int j)
    {
        for(int k=i;k<=j;k++)
        {
            System.out.print(str.charAt(k));
        }
    }
}
