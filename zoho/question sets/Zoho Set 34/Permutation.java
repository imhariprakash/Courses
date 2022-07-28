import java.util.Scanner;
public class Permutation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char a[]=new char[str.length()];
        for(int i=0;i<str.length();i++)
        a[i]=str.charAt(i);
        permutate(a,0,str.length()-1);      
        sc.close(); 
    }
    static void permutate(char a[],int s,int len)
    {
        if(s==len)
        {
            System.out.println(a);
            return;
        }
        for(int i=s;i<=len;i++)
        {
            boolean c=check(a,s,i);
            if(c)
            {
                swap(a,i,s);
                permutate(a,s+1,len);
                swap(a,i,s);
            }
        }
    }
    static void swap(char a[],int i,int j)
    {
        a[i]=(char)(a[i]+a[j]-(a[j]=a[i]));
    }
    static boolean check(char a[],int s,int i)
    {
        for(int l=s;l<i;l++)
        {
        if(a[l]==a[i])
        return false;
        }
        return true;
    }
}
