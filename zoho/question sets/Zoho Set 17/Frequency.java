import java.util.Scanner;
public class Frequency {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        frequency(a,n);
        sc.close();
    }    
    static void frequency(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if((count(a,a[j],n)<count(a,a[j+1],n)))
                a[j]=a[j]+a[j+1]-(a[j+1]=a[j]);
            }
        }
        printfrequency(a,n);
    }
    static int count(int a[],int b,int n)
    {
        int c=1;
        for(int i=0;i<n;i++)
        if(b==a[i])
        c++;
        return c;

    }
    static void printfrequency(int a[],int n)
    {
        int c=1;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
            c++;
            else
            {
                System.out.println(a[i]+" "+c);
                c=1;
            }
        }
        System.out.println(a[n-1]+" "+c);

    }
}
