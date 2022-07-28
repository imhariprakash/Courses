import java.util.Scanner;
public class CharacterOccur {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char n[]=new char[str.length()];
        for(int i=0;i<str.length();i++)
        n[i]=str.charAt(i);
        occurence(n);
        sc.close();
    }
    static void occurence(char n[])
    {
        for(int i=0;i<n.length;i++)
        {
            int c=1;
            if(i<n.length-1 && n[i]==n[i+1])
                c--;
            for(int j=i+1;j<n.length;j++)
            {
                if((j<n.length-1) && n[j]!='0' && n[i]==n[j] && n[j]==n[j+1])
                    n[j]='0';
                else if(n[j]!='0' && n[j]==n[i])
                {
                    n[j]='0';
                    c++;
                }
            }
            if(n[i]!='0')
            System.out.println(n[i]+" "+c);
        }
    }
}
