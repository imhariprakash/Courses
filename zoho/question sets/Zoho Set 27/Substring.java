import java.util.Scanner;
public class Substring {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String sub=sc.nextLine();
        if(check(str,sub,0,0,0,0))
        System.out.println("TRUE");
        else
        System.out.println("FALSE");
        sc.close();
    }
    static boolean check(String str,String sub,int s1,int s2,int f,int c)
    {
        if(s2==sub.length())
        return true;
        if(s1==str.length())
        return false;
        if(str.charAt(s1)==sub.charAt(s2))
        return(check(str,sub,s1+1,s2+1,0,c+1));
        if(sub.charAt(s2)=='*')
        return(check(str,sub,s1,s2+1,1,0));
        if(f==1)
        return(check(str,sub,s1+1,s2,1,c));
        if(f==0 && c!=0)
        return(check(str,sub,s1,s2-c,1,0));
        return check(str,sub,s1+1,s2,f,c);
    }
}
