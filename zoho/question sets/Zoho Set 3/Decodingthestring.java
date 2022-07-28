public class Decodingthestring{
    public static void main(String[] args)
    {
        String str="a1b10";
        int c=0;
        String sub="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='0'&& str.charAt(i)<='9')
            {
                c=c*10+str.charAt(i)-48;
            }
            else
            {
                if(c!=0)
                {
                for(int j=0;j<c;j++)
                System.out.print(sub);
                sub="";
                c=0;
                }
                sub+=str.charAt(i);
            }
        }
        if(c!=0)
        {
        for(int j=0;j<c;j++)
        System.out.print(sub);
        }
    }
}