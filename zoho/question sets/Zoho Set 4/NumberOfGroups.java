import java.util.Scanner;
public class NumberOfGroups {
    static int c=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int x=sc.nextInt();
        for(int i=2;i<=x;i++)
        combo(a,i,x);
        System.out.println("Number of groups: "+c);
        sc.close();
    }
    static void combo(int a[],int i,int x)
    {
        int d[]=new int[i];
        combo(a,d,0,a.length-1,0,i,x);
    }
    static void combo(int a[],int d[],int start,int end,int index,int r,int x)
    {
        if(index==r)
        {
            c++;
            for(int i=0;i<r-1;i++)
            System.out.print(d[i]+",");
            System.out.print(d[r-1]);
            System.out.println();
            return;
        }
        for(int i=start;i<=end && end-i+1>=r-index;i++)
        {
            if(a[i]%x==0)
            {
                d[index]=a[i];
                combo(a,d,i+1,end,index+1,r,x);
            }
            else continue;
        }
    }
}
