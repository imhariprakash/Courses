import java.util.Scanner;
public class Password {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        strength(s);
        sc.close();
    }
    static void strength(String s)
    {
        boolean haslower=false,hasupper=false,hasdigit=false,hasspl=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            haslower=true;
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            hasupper=true;
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
            hasdigit=true;
            else if(s.charAt(i)=='!' ||s.charAt(i)=='@'||s.charAt(i)=='#'||s.charAt(i)=='$'||s.charAt(i)=='%'||s.charAt(i)=='^'||s.charAt(i)=='&'||s.charAt(i)=='*'||s.charAt(i)=='('||s.charAt(i)==')'||s.charAt(i)=='-'||s.charAt(i)=='+')
            hasspl=true;
        }
        if(haslower &&hasupper &&hasdigit &&hasspl &&s.length()>=8)
        System.out.println("Strong Password");
        else if((haslower||hasupper ||hasspl)&& s.length()>=6)
        System.out.println("Moderate password");
        else
        System.out.println("Weak Password");
    }
}
