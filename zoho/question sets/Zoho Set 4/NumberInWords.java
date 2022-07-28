import java.util.Scanner;
public class NumberInWords {
    static String single_digit[]={"Zero","one","two","three","four","five","six","seven","eight","nine"};
    static String two_digits[]={"","ten","eleven","twevel","thirteen","fourteen","fifteen","sixteen","seventeen","eigtheen","nineteen"};
    static String tens_multiple[]={"","","tweenty","thirty","fourty","fifty","sixty","seventy","eigthy","ninty"};
    static String  tens_power[]={"hundred","thoushand"};
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char a[]=new char[str.length()];
        for(int i=0;i<str.length();i++)
        a[i]=str.charAt(i);
        word(a);
    }
    static void word(char a[])
    {
        int len=a.length;
        if(len==0)
        {
            System.out.println("Empty string");
            return;
        }
        if(len>4)
        {
            System.out.println("Not valid");
            return;
        }
        if(len==1)
        {
            System.out.println(single_digit[a[0]-48]);
            return;
        }
        int c=0;
        while(c<a.length)
        {
            if(len>=3)
            {
                if(a[c]-48!=0)
                {
                    System.out.print(single_digit[a[c]-48]+" "+tens_power[len-3]+" ");
                }
                len--;
            }
            else 
            {
                if(a[c]-48==1)
                {
                    System.out.print(two_digits[(a[c]-48+a[c+1]-48)]);
                    return;
                }
                else if(a[c]-48==2 && a[c+1]-48==0)
                {
                    System.out.println("Tweenty ");
                    return;
                }
                else
                {
                    if(a[c]-48>0){
                        System.out.print(tens_multiple[a[c]-48]+" ");
                    }
                    else
                    System.out.print(" ");
                    c++;
                    if(a[c]!='0')
                    System.out.print(single_digit[a[c]-48]);
                }
            }
            c++;
        }
    }
}
