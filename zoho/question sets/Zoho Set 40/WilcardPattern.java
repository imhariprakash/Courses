import java.util.Scanner;
public class WilcardPattern{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String pat=sc.next();
        System.out.println(wildcard(str,str.length(),pat,pat.length()));
        sc.close();
    }
    static boolean wildcard(String str,int n,String pat,int m)
    {
        if(n==0)
        return (m==0);
        int i=0,j=0,index_str=-1,index_pat=-1;
        while(i<n)
        {
            if(j<m && str.charAt(i)==pat.charAt(j))
            {
                i++;
                j++;
            }
            else if(j<m && pat.charAt(j)=='?')
            {
                i++;
                j++;
            }
            else if(j<m && pat.charAt(j)=='*')
            {
                index_str=i;
                index_pat=j;
                j++;
            }
            else if(index_pat!=-1)
            {
                j=index_pat+1;
                i=index_str+1;
                index_str++;
            }
            else
            return false;
        }
        while(j<m && pat.charAt(j)=='*')
        {
            j++;
        }
        if(j==m)
        return true;
        else
        return false;
    }
}