import java.util.Scanner;
public class Reverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=length(str);
        char a[]=new char[n];
        for(int i=0;i<n;i++)
        a[i]=str.charAt(i);
        rev(a,n);
        System.out.print(a);
        sc.close();
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
    static void rev(char a[],int n)
    {
        int i=0,j=n-1;
        while(i<j)
        {
            if(!((a[i]>='a' && a[i]<='z') || (a[i]>='A' && a[i]<='Z')||(a[i]>='1'&&a[i]<='9')))
            i++;
            else if(!((a[j]>='a' && a[j]<='z')||(a[j]>='A'&& a[j]<='Z')||(a[j]>='1'&&a[j]<='9')))
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
