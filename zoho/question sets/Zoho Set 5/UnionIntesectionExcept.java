public class UnionIntesectionExcept{
    public static void main(String[] args)
    {
        int a[]={1,3,4,5,6,8,9};
        int b[]={1,5,8,9,2};
        union(a,b);
        intersect(a,b);
        except(a,b);
    }
    static void union(int a[],int b[])
    {
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        for(int i=0;i<b.length;i++)
        {
            int f=0;
            for(int j=0;j<a.length;j++)
            {
                if(b[i]==a[j])
                f=1;
            }
            if(f==0)
            System.out.print(b[i]+" ");
        }
    }
    static void  intersect(int a[],int b[])
    {
        System.out.println();
        System.out.println("Intersection");
        int n1=a.length,n2=b.length;
        for(int i=0;i<n1;i++)
        {
            int f=0;
            for(int j=0;j<n2;j++)
            {
                if(a[i]==b[j])
                f=1;
            }
            if(f==1)
            System.out.print(a[i]+" ");
        }
    }
    static void except(int a[],int b[])
    {
        System.out.println();
        System.out.println("Except");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            System.out.print(a[i]+" ");
        }
        for(int j=0;j<b.length;j++)
        {
            if(b[j]%2==0)
            System.out.print(b[j]+" ");

        }
    }
}