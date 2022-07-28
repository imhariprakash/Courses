import java.util.Scanner;
public class ReverseWord {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=length(str);
        reverse(str,0,0,n);
        sc.close();
    }    
    static void reverse(String str,int s,int c,int n)
    {
        if(n==s)
        {
            printchar(str,s-c,s);
            System.out.print(" ");
          return;
        }

         if(str.charAt(s)==' ')
            {
                reverse(str,s+1,0,n);
                printchar(str,s-c,s);
                System.out.print(" ");
            }
            else
            {
                reverse(str,s+1,c+1,n);
            }
    }
    static void printchar(String str,int s,int e)
    {
        for(int i=s;i<e;i++)
        System.out.print(str.charAt(i));
    }
    static int length(String str)
    {
        int i=0;
        while(true)
        {
            try{
                str.charAt(i);
                i++;
            }
            catch(Exception e)
            {
                return i;
            }
        }
    }
}
