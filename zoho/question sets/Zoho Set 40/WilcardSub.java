import java.util.Scanner;
public class WilcardSub{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String pat=sc.nextLine();
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
            else if(j==m)
            return true;
            else if(index_pat!=-1)
            {
                j=index_pat+1;
                i=index_str+1;
                index_str++;
            }
            else
            {
                i++;
            }
        }
        while(j<m && pat.charAt(j)=='*')
        {
            j++;
        }
        if(i==n && pat.charAt(j-1)!='*')
        return true;
        else
        return false;
    }
}