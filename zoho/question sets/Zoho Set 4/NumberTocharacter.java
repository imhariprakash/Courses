import java.util.Scanner;
public class NumberTocharacter {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NoTocharacter(n);
        sc.close();
    }
    static void NoTocharacter(int n)
    {
        String str="";
        while(n>0)
        {
            if(n%26==0)
            {
                str+='Z';
                n=n/26-1;
            }
            else
            {
                str+=(char)(64+n%26);
                n=n/26;
            }
        }
        for(int i=str.length()-1;i>=0;i--)
        System.out.print(str.charAt(i));
    }
}
