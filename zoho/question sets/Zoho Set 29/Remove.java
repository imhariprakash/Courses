import java.util.Scanner;
public class Remove {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        s[i]=sc.next();
        check(s,n);
    }
    static void check(String s[],int n)
    {
        while(n>0)
        {
            char k=sc.next().charAt(0);
            for(int i=0;i<n;i++)
            {
                String l=remove(s[i],k);
                if(l=="")
                {
                    shift(s,i,n);
                    n=n-1;
                    i=i-1;
                }
                else
                s[i]=l;
            }
            printarray(s,n);
        }
        System.out.println("Array is Empty");
    }
    static String remove(String l,char k)
    {
        String sub="";
        for(int i=0;i<l.length();i++)
        {
            if(k!=l.charAt(i))
            sub=sub+l.charAt(i);
        }
        return sub;
    }
    static void shift(String s[],int i,int n)
    {
        for(int j=i;j<n-1;j++)
            s[j]=s[j+1];
    }
    static void printarray(String s[],int n)
    {
        for(int i=0;i<n;i++)
        System.out.print(s[i]+" ");
    }
}
