public class Mathematical {
    public static void main(String[] args)
    {
        String str="1*2+3";
        solve(str);
    }
    static void solve(String str)
    {
        int res=(int)str.charAt(0)-48;
        for(int i=1;i<str.length()-1;i++)
        {
            if(!(str.charAt(i)>='0' &&str.charAt(i)<='9'))
            {
                if(str.charAt(i)=='*')
                res*=((int)str.charAt(i+1)-48);
                else if(str.charAt(i)=='-')
                res-=((int)str.charAt(i+1)-48);
                else if(str.charAt(i)=='+')
                res+=((int)str.charAt(i+1)-48);
                else if(str.charAt(i)=='/')
                res/=((int)str.charAt(i+1)-48);
                i++;
            }
        }
        System.out.println(res);
    }
}
