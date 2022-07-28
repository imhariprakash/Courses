import java.util.Scanner;
public class ConvertStrtoNo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int a[]=new int[str.length()];
        int c=0,f=1,k=0;
        sc.close();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='-')
                f=-1;
            else if(str.charAt(i)>='0' &&str.charAt(i)<='9')
                c=c*10+(int)str.charAt(i)-48;
            else
            {
                a[k++]=c*f;
                c=0;
                f=1;
            }
        }
        a[k]=c*f;
        for(int i=0;i<=k;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
