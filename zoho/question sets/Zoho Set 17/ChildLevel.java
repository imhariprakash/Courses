import java.util.Scanner;
public class ChildLevel {
    static int count=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[][]=new String[n][2];
        for(int i=0;i<n;i++)
        {
            str[i][0]=sc.next();
            str[i][1]=sc.next();
        }
        int level=sc.nextInt();
        String name=sc.next();
        grandchild(str,n,name,0,level);
        System.out.print(count);
        sc.close();
    }
    static void grandchild(String s[][],int n,String name,int l,int level)
    {
        if(level-1==l)
        {
            countgrandchild(s,n,name);
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(equal(s[i][1],name))
            {
                name=s[i][0];
                grandchild(s,n,name,++l,level);
                name=s[i][1];
                l=l-1;
            }
        }
    }
    static boolean equal(String s,String name)
    {
        int l1=length(s),l2=length(name),i=0,j=0;
        if(l1==l2)
        {
            while(i<l1 && j<l2)
            {
                if(s.charAt(i)==name.charAt(j))
                {
                    i++;j++;
                }
                else
                return false;
            }
            return true;
        }
        return false;
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
    static void countgrandchild(String s[][],int n,String name)
    {
        for(int i=0;i<n;i++)
        {
            if(equal(s[i][1],name))
                count++;
        }
    }
}
