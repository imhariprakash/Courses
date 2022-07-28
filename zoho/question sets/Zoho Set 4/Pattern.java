public class Pattern {
    public static void main(String[] args)
    {
        int n=6,m=7;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int min=i<j?i:j;
                min=m-i-1<min?m-i-1:min;
                min=n-j-1<min?n-j-1:min;
                System.out.print((m-min)%2==0?"0 ":"X ");
            }
            System.out.println();
        }
    }
}
