public class Pattern {
    public static void main(String[] args)
    {
        int n=4;
        pat(n);
    }
    static void pat(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
