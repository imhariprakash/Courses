import java.util.Scanner;
public class Password{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        checkpassword(str);
        sc.close();
    }
    static void checkpassword(String str)
    {
        boolean haslower=false,hasupper=false,hasnum=false,hasspl=false;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            haslower=true;
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            hasupper=true;
            else if(str.charAt(i)>='0' && str.charAt(i)<='9')
            hasnum=true;
            else if(check(str.charAt(i)))
            hasspl=true;
        }
        if(haslower && hasnum && hasupper &&hasspl &&str.length()>=8)
            System.out.println("Strong password");
        else if((haslower || hasupper || hasspl) && str.length()>=6)
        System.out.println("Moderate Password");
        else 
        System.out.println("Weak Passord");

    }
    static boolean check(char a)
    {
        if(a=='!'||a=='@'||a=='#'||a=='$'||a=='%'||a=='^'||a=='&'||a=='*'||a=='('||a==')'||a=='-'||a=='+')
        return true;
        return false;
    }
}