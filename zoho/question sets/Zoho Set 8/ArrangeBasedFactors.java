public class ArrangeBasedFactors{
    public static void main(String[] args)
    {
        int a[]={104,210,315,166,441,180};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(fact(a[j])<fact(a[j+1]))
                {
                    a[j]=a[j]+a[j+1]-(a[j+1]=a[j]);
                }
            }
        }
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
    static int fact(int a)
    {
        int c=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            c++;
        }
        return c;
    }
}