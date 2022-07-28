import java.util.Scanner;
public class Panagram{
    static int a[]=new int[26];
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        panagramprint(s);
        System.out.println(check());
        sc.close();
    }
    static void panagramprint(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
            {
                int n=s.charAt(i)-97;
                a[n]=a[n]+1;
            }
            else if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
            {
                int n=s.charAt(i)-65;
                a[n]=a[n]+1;
            }
        }
    }
    static boolean check()
    {
        for(int i=0;i<26;i++)
        {
            if(a[i]==0)
            return false;
        }
        return true;
    }
}