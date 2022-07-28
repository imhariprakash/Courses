public class OddEvenpattern {
    public static void main(String[] args)
    {
        int n=4;
        patternprint(n);
    }
    static void patternprint(int n)
    {
        int odd=1,even=2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%2!=0)
                {
                System.out.print(odd+" ");
                odd=odd+2;
                }
                else
                {
                    System.out.print(even+" ");
                    even=even+2;
                }
            }
            System.out.println();
        }
    }
}
