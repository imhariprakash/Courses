import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(palindrome(str,str.length()-1))
        System.out.println("Yes");
        else
        System.out.println("No");
        sc.close();
    }
    static boolean palindrome(String s,int j)
    {
        int i=0;
        while(i<j)
        {
            if(!((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='0' && s.charAt(i)<='9')))
                i++;
            else if(!((s.charAt(j)>='A' && s.charAt(j)<='Z')||(s.charAt(j)>='a' && s.charAt(j)<='z')||(s.charAt(j)>='0' && s.charAt(j)<='9')))
            j--;
            else if(s.charAt(i)!=s.charAt(j))
                return false;
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}