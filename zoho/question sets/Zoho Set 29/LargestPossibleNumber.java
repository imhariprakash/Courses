import java.util.Scanner;
public class LargestPossibleNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        a[i]=sc.next();
        largestNo(a,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]);
        sc.close();
    }
    static void largestNo(String a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                String str=a[i]+a[j];
                String sub=a[j]+a[i];
                if(number(str)<number(sub))
                swap(a,i,j);
            }
        }
    }
    static void swap(String a[],int i,int j)
    {
        String str=a[i];
        a[i]=a[j];
        a[j]=str;
    }
    static int number(String str)
    {
        int i=0,n=0;
        while(i<str.length())
        {
            n=n*10+(int)str.charAt(i)-48;
            i++;
        }
        return n;
    }
}
