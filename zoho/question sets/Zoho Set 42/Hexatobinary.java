import java.util.Scanner;
public class Hexatobinary {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        hextobin(n);
        sc.close();
    }
    static void hextobin(String n)
    {
        String str="";
        int f=0;
        for(int i=0;i<n.length();i++)
        {
            if(binary(n.charAt(i))!="")
                str+=binary(n.charAt(i));
            else
            {
                System.out.println("Invalid Input");
                f=1;
                break;
            }
        }
        if(f!=1)
        System.out.println(str);
    }
    static String binary(char a)
    {
        int n=0,i=0,s=0,d=1;String str="";
        if(a>='0' && a<='9')
        n=a-48;
        else if(a>='A' && a<='F')
        n=a-55;
        else if(a>='a' && a<='f')
        n=a-87;
        else
        return str;
        while(n>0 ||i<4)
        {
            if(n>0)
            {
            int l=n%2;
            s=s+d*l;
            d=d*10;
            n/=2;
            }
            else
            str+=0;
            i++;
        }
        str+=s;
        return str;
    }
}
