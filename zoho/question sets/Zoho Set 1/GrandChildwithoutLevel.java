public class GrandChildwithoutLevel {
    public static void main(String[] args)
    {
        String str[][]={{"luke","shaw"},
                        {"wayne","rooney"},
                        {"rooney","ronaldo"},
                       {"shaw","rooney"}};
        String sub="ronaldo";
        int c=0;
        for(int i=0;i<str.length;i++)
        {
            if(equal(sub,str[i][1]))
            {
                c=c+count(str,str[i][0]);
            }
        }
        System.out.println(c);
    }
    static int count(String str[][],String a)
    {
        int c=0;
        for(int i=0;i<str.length;i++)
        {
            if(equal(a,str[i][1]))
            c++;
        }
        return c;
    }
    static boolean equal(String str,String sub)
    {
        int i=0,j=0;
        while(i<str.length() && j<sub.length())
        {
            if(str.charAt(i)!=sub.charAt(j))
            return false;
            i++;
            j++;
        }
        if(i==str.length() && j==sub.length())
        return true;
        return false;
    }
}
