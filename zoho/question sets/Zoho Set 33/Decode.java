import java.util.Scanner;
public class Decode {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(countchar(str));
        sc.close();
    }
    static int countchar(String str)
    {
        if(str.length()==0 || str.charAt(0)=='0')
        return 0;
        if(str.length()==1)
        return 1;
        int count1=1,count2=1;
        for(int i=1;i<str.length();i++)
        {
            int d=str.charAt(i)-48;
            int dd=(str.charAt(i-1)-48)*10+d;
            int count=0;
            if(d>0)
            count+=count2;
            if(dd>=10 &&dd<=26)
            count+=count1;
            count1=count2;
            count2=count;
        }
        return count2;
    }
}
