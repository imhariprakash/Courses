import java.util.Scanner;
public class Anagram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        str[i]=sc.next();
        String word=sc.next();
        anagramcheck(str,word,n);
        sc.close();
    }
    static void anagramcheck(String str[],String word,int n)
    {
        String l=sort(word);
        for(int i=0;i<n;i++)
        {
            if(str[i].length()==word.length())
            {
                String s=sort(str[i]);
                if(equal(s,l))
                System.out.print(str[i]+" ");
            }
        }
    }
    static String sort(String str)
    {
        String st="";
        char a[]=new char[str.length()];
        for(int i=0;i<str.length();i++)
        a[i]=str.charAt(i);
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
                if(a[i]>a[j])
                a[i]=(char)(a[i]+a[j]-(a[j]=a[i]));
            st+=a[i];
        }
        return st;
    }
    static boolean equal(String str,String w)
    {
        for(int i=0;i<str.length();i++)
        if(str.charAt(i)!=w.charAt(i))
        return false;
        return true;
    }
}
