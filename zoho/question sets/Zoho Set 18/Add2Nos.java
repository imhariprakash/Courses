import java.util.Scanner;
public class Add2Nos{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a[]=new int[n1];
        for(int i=0;i<n1;i++)
        a[i]=sc.nextInt();
        int n2=sc.nextInt();
        int b[]=new int[n2];
        for(int i=0;i<n2;i++)
        b[i]=sc.nextInt();
        int n3=n1>n2?n1+1:n2+1;
        int c[]=new int[n3];
        add(a,n1,b,n2,c,n1+n2);
        sc.close();
    }
    static void add(int a[],int n1,int b[],int n2,int c[],int l)
    {
        int k=0,m=0;
        n1--;n2--;
        while(n1>=0 || n2>=0)
        {
            if(n1>=0 && n2>=0)
            {
                c[k++]=(m+a[n1]+b[n2])%10;
                m=(m+a[n1]+b[n2])/10;
                n1--;
                n2--;
            }
            else if(n1>=0)
            {
                c[k++]=(m+a[n1])%10;
                m=(m+a[n1])/10;
                n1--;
            }
            else
            {
                c[k++]=(m+b[n1])%10;
                m=(m+b[n2])/10;
                n2--;
            }
        }
        if(m!=0)
        c[k++]=m;
        for(int i=k-1;i>=0;i--)
        System.out.print(c[i]+" ");

    }
}