import java.util.Scanner;
public class FirstOccurrences {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String sub=sc.next();
        ouccrence(str,sub);
        sc.close();
    }
    static void ouccrence(String str,String sub)
    {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<sub.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(sub.charAt(i)==str.charAt(j))
                {
                    if(min>j)
                    min=j;
                    if(max<j)
                    max=j;
                    break;
                }
            }
        }
        if(min!=Integer.MAX_VALUE && max!=Integer.MIN_VALUE)
        {
            for(int i=min;i<=max;i++)
            System.out.print(str.charAt(i));
        }
    }
}
