import java.util.Scanner;
public class CricketScores {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        score(s);
        sc.close();
    }
    static void score(String s)
    {
        int p1=0,p2=0,f=0,extra=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                int n=s.charAt(i)-48;
                if(f==0)
                p1+=n;
                else
                p2+=n;
                if(n%2!=0)
                    f=f>0?0:1;
            }
            else if(s.charAt(i)=='.')
            continue;
            else
            {
                extra+=1;
            }
        }
        System.out.println("p1 :"+p1);
        System.out.println("p2 :"+p2);
        System.out.println("EXTRA :"+extra);
    }
}
