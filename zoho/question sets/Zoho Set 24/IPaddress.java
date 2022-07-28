import java.util.Scanner;
public class IPaddress {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(checkvalid(str))
        System.out.println("Valid");
        else
        System.out.println("Not Valid");
        sc.close();
    }
    static boolean checkvalid(String str)
    {
        int c=0,d=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='.')
            {
                d++;
                if(c==0)
                return false;
                if(!strvalid(str,i-c,i))
                return false;
                c=0;
            }
            else
            c++;
        }
        if(!strvalid(str,str.length()-c,str.length()))
        return false;
        if(d==3)
        return true;
        return false;
    }
    static boolean strvalid(String str,int i,int c)
    {
        int n=0;
        for(int k=i;k<c;k++)
            n=n*10+(int)str.charAt(k)-48;
        if(n<=255)
        return true;
        return false;
    }
}
