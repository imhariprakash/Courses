import java.util.Scanner;
public class Decode {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String word="";
        decodingstring(str,word);
        sc.close();
    }
    static void decodingstring(String str,String word)
    {
        if(str=="")
        {
            System.out.println(word);
            return;
        }
        int n=(int)(str.charAt(0))-48;
        decodingstring(sub(str,1,str.length()), word+(char)('A'+n-1));
        if(str.length()>=2 && ((n=convert(sub(str,0,2)))<=26))
        decodingstring(sub(str,2,str.length()),word+(char)('A'+n-1));
    }
    static int convert(String str)
    {
        int n=0;
        for(int i=0;i<str.length();i++)
        n=n*10+(int)(str.charAt(i)-48);
        return n;
    }
    static String sub(String str,int i,int j)
    {
        String a="";
        for(int k=i;k<j;k++)
        a=a+str.charAt(k);
        return a;
    }
}
