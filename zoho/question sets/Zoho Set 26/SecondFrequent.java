import java.util.Scanner;
public class SecondFrequent{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        secondfreq(a,n,max);
        sc.close();
    }
    static void secondfreq(int a[],int n,int m)
    {
        int c=1,first=Integer.MIN_VALUE,sec=Integer.MIN_VALUE,firste=0,sece=0;
        for(int i=0;i<n;i++)
        {
             c=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]!=m &&a[i]==a[j])
                {
                    c++;
                    a[j]=m;
                }
            }
            if(first<c)
            {
                sec=first;
                sece=firste;
                first=c;
                firste=a[i];
            }
            else if(sec<c &&a[i]!=m)
            {
                sec=c;
                sece=a[i];
            }
        }
        if(sec!=Integer.MIN_VALUE)
        System.out.println(sece+"---->"+sec);
        else
        System.out.println("No Second Frequently occuring number");
    }
}