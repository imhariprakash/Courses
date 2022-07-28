import java.util.Scanner;
public class Insert {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("enter index:");
        int pos=sc.nextInt();
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        insertelement(a,n,pos,num);
        printarray(a);
        sc.close();
    }
    static void insertelement(int a[],int n,int pos,int num)
    {
        for(int i=0;i<n;i++)
        {
            if(pos<=i)
            num=a[i]+num-(a[i]=num);
        }
       a[n]=num;
    }
    static void printarray(int a[])
    {
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
}
