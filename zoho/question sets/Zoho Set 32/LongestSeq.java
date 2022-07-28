import java.util.Scanner;
public class LongestSeq{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(check(str));
        sc.close();
    }
    static int check(String str)
    {
        int min=-1,c=-1;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                    c=j-i-1;
            }
            if(c>min)
                min=c;
        }
        return min;
    }
}