import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s[]=new String[100];
        int l=stringarray(str,s);
        for(int i=0;i<l;i++)
        System.out.print(s[i]+" ");
        sc.close();
    }
    static int stringarray(String str,String s[])
    {
        String sub="";
        int k=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                if(palindrome(sub))
                s[k++]=sub;
                sub="";
            }
            else 
                sub+=str.charAt(i);
        }
        if(sub!="" && palindrome(sub))
        s[k++]=sub;
        return k;
    }
    static boolean palindrome(String str)
    {
        int i=0,j=str.length()-1;
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            return true;
            i++;
            j--;
        }
        return false;
    }
}
