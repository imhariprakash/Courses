import java.util.Scanner;
public class WordBreak{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String dic[]=new String[n];
        for(int i=0;i<n;i++)
        dic[i]=sc.next();
        String word=sc.next();
        System.out.println(wordbreak(dic,word));
        sc.close();
    }
    static boolean wordbreak(String dic[],String word)
    {
       if(word.length()==0)
       return true;
       for(int i=1;i<=word.length();i++)
       {
           String s=sub(0,i,word);
           if(iscontain(s,dic) && wordbreak(dic,sub(i,word.length(),word)))
           return true;
       }
       return false;
    }
    static String sub(int i,int j,String word)
    {
        String r="";
        for(int k=i;k<j;k++)
        r+=word.charAt(k);
        return r;
    }
    static boolean iscontain(String s,String dic[])
    {
        for(int i=0;i<dic.length;i++)
        {
            if(s.equals(dic[i]))
            return true;
        }
        return false;
    }
}