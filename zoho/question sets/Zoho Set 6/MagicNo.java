public class MagicNo {
    public static void main(String[] args)
    {
        int n=1234;
        if(magic(n))
            System.out.println("Yes");
        else
        System.out.println("No");
    }
    static boolean magic(int n)
    {
        int sum=0;
        while(n>0 ||sum>9)
        {
            if(n==0)
            {
                n=sum;
                sum=0;
            }
            sum+=n%10;
            n=n/10;
        }
        if(sum==1)
        return true;
        else
        return false;
    }
}
