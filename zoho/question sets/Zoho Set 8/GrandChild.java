import java.util.Scanner;
public class GrandChild {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        String n[][]=new String[l][2];
        for(int i=0;i<l;i++)
        {
            n[i][0]=sc.next();
            n[i][1]=sc.next();
        }
        System.out.println("Enter the String to find grandchild");
        String str=sc.next();
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(equal(str,n[i][1]))
            {
                c=c+findchild(n[i][0],n);
            }
        }
        System.out.println(c);
        sc.close();
    }
    static int findchild(String a,String n[][])
    {
        int c=0;
        for(int i=0;i<n.length;i++)
        {
            if(equal(a,n[i][1]))
            c++;
        }
        return c;
    }
    static boolean equal(String str,String a)
    {
        if(str.length()==a.length())
        {
            int i=0;
            while(i<str.length())
            {
                if(str.charAt(i)!=a.charAt(i))
                return false;
                i++;
            }
            if(i==str.length())
            return true;
        }
        return false;
    }
}
