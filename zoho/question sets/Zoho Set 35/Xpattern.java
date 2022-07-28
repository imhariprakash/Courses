import java.util.Scanner;
public class Xpattern{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.length()%2!=0)
        pattern(str);
        sc.close();
    }
    static void pattern(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(i==j || i+j==s.length()-1)
                System.out.print(s.charAt(j));
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    } 
}