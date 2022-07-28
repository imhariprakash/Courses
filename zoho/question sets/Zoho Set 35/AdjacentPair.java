import java.util.Scanner;
public class AdjacentPair {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s=sc.next();
        check(str,s);
        sc.close();
    }
    static void check(String str,String s)
    {
        int c=0,i=0;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=s.charAt(i))
            {
                c++;
            }
            else if(c>0)
            {
                printcharacter(str,i-c,i);
                System.out.print("-");
                printcharacter(s,i-c,i);
                System.out.println();
                c=0;
            }
        }
        if(c>0)
        printcharacter(str,i-c,i);
        System.out.print("-");
        printcharacter(s,i-c,i);
        System.out.println();
    }
    static void printcharacter(String str,int i,int j)
    {
        for(int k=i;k<j;k++)
        System.out.print(str.charAt(k));
    }
}
