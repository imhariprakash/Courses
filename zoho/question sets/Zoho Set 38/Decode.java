import java.util.Scanner;
public class Decode {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String word="";
        string(s,word);
        sc.close();
    }
    static void string(String str,String word)
    {
        if(str=="")
        {
            System.out.println(word);
            return;
        }
        int n=str.charAt(0)-48;
        string(sub(1,str.length(),str),word+(char)('a'+n-1));
        if(str.length()>=2 && count(0,2,str)<=26)
            string(sub(2,str.length(),str),word+(char)('a'+count(0,2,str)-1));
    }
    static String sub(int i,int j,String str)
    {
        String s="";
        for(int k=i;k<j;k++)
        s+=str.charAt(k);
        return s;
    }
    static int count(int i,int l,String str)
    {
        int n=0;
        for(int k=i;k<l;k++)
        n=n*10+(str.charAt(k)-48);
        return n;
    }
}
