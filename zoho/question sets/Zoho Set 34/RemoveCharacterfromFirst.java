import java.util.Scanner;
public class RemoveCharacterfromFirst{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s=sc.next();
        remove(str, s);
        removee(str,s);
        sc.close();
    }
    static void remove(String str,String s)    //remove all character in string 1 which is present in string2;
    {
        int f=0;
        String r="";
        for(int i=0;i<str.length();i++)
        {
            f=0;
            for(int j=0;j<s.length();j++)
            {
                if(str.charAt(i)==s.charAt(j))
                f=1;
            }
            if(f==0)
            r+=str.charAt(i);
        }
        System.out.println(r);
    }
    static void removee(String str,String s)          //remove the characters that present in the string 2 
    {
        int f=0;
        for(int i=0;i<s.length();i++)
        {
            f=0;
            String r="";
            for(int j=0;j<str.length();j++)
            {
                if(s.charAt(i)==str.charAt(j) && f==0)
                    f=1;
                else
                r+=str.charAt(j);
            }
            str=r;
        }
        System.out.println(str);
    }
}