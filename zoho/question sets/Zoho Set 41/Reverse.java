import java.util.Scanner;
public class Reverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        a[i]=s.charAt(i);
        reversestring(a,s.length()-1);
        for(int i=0;i<s.length();i++)
        System.out.print(a[i]);
        sc.close();
    }
    static void reversestring(char a[],int j)
    {
        int i=0;
        while(i<j)
        {
            if(!((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&& a[i]<='Z')||(a[i]>='0'&&a[i]<='9')))
            i++;
            else if(!((a[j]>='a'&&a[j]<='z')||(a[j]>='A'&& a[j]<='Z')||(a[j]>='0'&&a[j]<='9')))
            j--;
            else
            {
                a[i]=(char)(a[i]+a[j]-(a[j]=a[i]));
                i++;
                j--;
            }
        }
    }
}
