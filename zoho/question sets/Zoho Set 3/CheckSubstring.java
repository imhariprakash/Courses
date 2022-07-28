public class CheckSubstring {
    public static void main(String[] args)
    {
        String str="test12";
        String sub="1234";
        System.out.println(check(str,sub));
    }
    static int check(String str,String sub)
    {
        int i=0,j=0,c=0;
        for(i=0;i<str.length();i++)
        {
            if(j==sub.length())
                return i-c;
            if(str.charAt(i)==sub.charAt(j))
            {
                c++;
                j++;
            }
            else
            {
                c=0;
                j=0;
            }
        }
        if(j==sub.length())
        return i-c;
        else
        return -1;
    }
}
