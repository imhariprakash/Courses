import java.util.Scanner;
public class Longest {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int maxcount=longestConsecutive(a);   
        printtheelments(a,maxcount);
        sc.close();
    }
    static  int longestConsecutive(int a[]) 
    {
        sort(a);
        int c=1,max=1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1]-1)
            c++;
            else
            {
                if(c>max)
                max=c;
                c=1;
            }
        }
        return max;
    }
    static void sort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                a[i]=a[i]+a[j]-(a[j]=a[i]);
            }
        }
    }
    static void printtheelments(int a[],int max)
    {
        int c=1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1]-1)
            c++;
            else 
            {
                if(c==max)
                printnumbers(a,i-c+1,c);
                c=1;
            }
        }
        if(c==max)
            {
                printnumbers(a,a.length-c,a.length);
                c=1;
            }
    }
    static void printnumbers(int a[],int i,int c)
    {
        for(int j=i;j<c;j++)
        System.out.print(a[j]+" ");
        System.out.println();
    }
}
