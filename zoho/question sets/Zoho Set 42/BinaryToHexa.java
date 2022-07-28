import java.util.Scanner;
public class BinaryToHexa {
    static String str="";
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        binhex(s);
        System.out.println(str);
        sc.close();
    }
    static void binhex(String s)
    {
        int j=0,k=0,d=1;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(j<3)
            {
                k=k+(s.charAt(i)-48)*d;
                j++;
                d=d*10;
            }
            else
            {
                k=k+(s.charAt(i)-48)*d;
                hexa(k);
                j=0;
                d=1;
                k=0;
            }
        }
        if(k!=0)
        hexa(k); 
    }
    static void hexa(int k)
    {
        int d=1,n=0;
        while(k>0)
        {
            int r=k%10;
            n=n+r*d;
            k/=10;
            d=d*2;
        }
        if(n<=9)
        str=n+str;
        else if(n>=10 && n<=15)
        {
            char a=(char)(55+n);
            str=a+str;
        }
    }
}
