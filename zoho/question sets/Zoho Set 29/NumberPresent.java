import java.util.Scanner;
public class NumberPresent {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String sub=sc.next();
        if(check(str,sub))
        System.out.println("True");
        else
        System.out.println("False");
        sc.close();
    }
    static boolean check(String str,String sub)
    {
        int l=0,c=0;
        for(int i=0;i<str.length();i++)
        {
            if(c==sub.length())
            {
                return true;
            }
            if(str.charAt(i)==sub.charAt(l))
            {
                c++;
                l++;
            }
            else
            {
                c=0;
                l=0;
            }
        }
        if(c==sub.length())
        return true;
        return false;
    }
}
