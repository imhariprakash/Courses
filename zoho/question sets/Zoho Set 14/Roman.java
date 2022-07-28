import java.util.Scanner;
public class Roman {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=length(s);
        roman(s,n);
        sc.close();
    }    
    static void roman(String s,int n)
    {
        int k=0;
        for(int i=0;i<n;i++)
        {
            int l=decimal(s.charAt(i));
            if(i+1<n)
            {
                int m=decimal(s.charAt(i+1));
                if(l<m)
                {
                k=k+m-l;
                i++;
                }
                else
                k=k+l;
            }
            else
            k=k+l;

        }
        System.out.println(k);
    }
    static int length(String s)
    {
        int i=0;
        while(true)
        {
            try{
                s.charAt(i);
                i++;
            }
            catch(Exception e)
            {
                return i;
            }
        }
    }
    static int decimal(char a)
    {
        switch(a)
        {
            case 'I':
             return 1;
            case 'V':
            return 5;
            case 'X':
            return 10;
            case 'L':
            return 50;
            case 'C':
            return 100;
            case 'D':
            return 500;
            case 'M':
            return 1000;
            default:
            return -1;

        }
    }
}
