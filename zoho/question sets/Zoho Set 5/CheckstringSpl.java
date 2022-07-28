import java.util.Scanner;
public class CheckstringSpl {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String sub=sc.nextLine();
        if(isSubseq(str,sub,0,0,0,0))
        System.out.println("True");
        else
        System.out.println("False");
        sc.close();
    }
    static boolean isSubseq(String str,String sub,int m,int n,int f,int c)
    {
        if(n==sub.length())
        return true;
        if(m==str.length())
        return false;
        if(str.charAt(m)==sub.charAt(n))
        return isSubseq(str,sub,m+1,n+1,0,c+1);
        if(sub.charAt(n)=='*')
        return isSubseq(str,sub,m,n+1,1,0);
        if(f==1)
        return isSubseq(str,sub,m+1,n,1,c);
        if(f==0 && c!=0)
        return isSubseq(str,sub,m,n-c,1,0);
        return isSubseq(str,sub,m+1,n,f,c);
    }
}
