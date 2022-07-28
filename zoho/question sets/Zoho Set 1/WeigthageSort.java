import java.util.Scanner;
public class WeigthageSort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        weight(a);
        sc.close();
    }
    static void weight(int a[])
    {
       for(int i=0;i<a.length;i++)
       {
           for(int j=0;j<a.length-i-1;j++)
           {
               if(sum(a[j])<sum(a[j+1]))
               {
                   a[j]=a[j]+a[j+1]-(a[j+1]=a[j]);
               }
           }
       }
       for(int i=0;i<a.length;i++)
       System.out.println(a[i]+" = "+sum(a[i]));
    }
    static int sum(int k)
    {
        int s=0;
        int l=(int)Math.sqrt(k);
        if(l*l==k)
        s=s+5;
        if(k%4==0 && k%6==0)
        s=s+4;
        if(k%2==0)
        s=s+3;
        return s;
    }
}
