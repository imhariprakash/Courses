import java.util.Scanner;
public class RemovePalindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        remove(s);
        sc.close();
    }
    static void remove(String s)
    {
        int c=0,i=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                if(palindrome(s,i-c,i-1))
                {
                    printstring(s,i-c,i);
                }
                c=0;
            }
            else
            c++;
        }
        if(palindrome(s,i-c,i-1))
        {
            printstring(s,i-c,i);
        }
    }
    static boolean palindrome(String s,int i,int j)
    {
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            return true;
            i++;
            j--;
        }
        return false;
    }
    static void printstring(String s,int i,int j)
    {
        for(int k=i;k<j;k++)
        System.out.print(s.charAt(k));
        System.out.print(" ");
    }
}
