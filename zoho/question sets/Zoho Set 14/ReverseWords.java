import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=length(str);
        char a[]=new char[n];
        for(int i=0;i<n;i++)
        a[i]=str.charAt(i);
        reversewords(a,n);
        reverse(a,0,n);
        System.out.print(a);
    }
    static void reversewords(char a[],int n)
    {
        int c=0,i,start=-1,end=-1;
        for(i=0;i<n;i++)
        {
            if(a[i]==' ')
            {
                start=i-c;
                end=i;
                reverse(a,start,end);
                c=0;
            }
            else
            c++;
        }
        if(c!=0)
        reverse(a,i-c,i);
    }
    static void reverse(char a[],int s,int e)
    {
        e--;
        while(s<e)
        {
            a[s]=(char)(a[s]+a[e]-(a[e]=a[s]));
            s++;
            e--;
        }
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
