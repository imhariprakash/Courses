import java.util.Scanner;
public class Pattern{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        pat(str);
        sc.close();
    }
    static void pat(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.length()%2==0 && i==str.length()/2)
            continue;
            for(int j=0;j<str.length();j++)
            {
                if(i==j ||i+j==str.length()-1)
                System.out.print(str.charAt(j));
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}