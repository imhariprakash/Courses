import java.util.Scanner;
public class LookAndSay {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LSpattern(n);
        sc.close();
    }
    static void LSpattern(int n)
    {
        String k="1";
        int c=1,j;
        for(int i=0;i<n;i++)
        {
            c=1;
            String str="";
            System.out.println(k);
            for(j=0;j<k.length()-1;j++)
            {
                if(k.charAt(j)==k.charAt(j+1))
                c++;
                else
                {
                    str+=c+""+k.charAt(j);
                    c=1;
                }
            }
            str=str+c+""+k.charAt(j);
            k=str;
        }
    }
}
