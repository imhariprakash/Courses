import java.util.Scanner;
public class Binarydecimal {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        binaryprint(n);
        sc.close();
    }    
    static void binaryprint(int n)
    {
        if(n==0)
        return;
            int m=n,s=0,d=1,l=0;
            while(m>0)
            {
                int k=(m%10)-1;
                if(k>=0)
                {
                    l=l+1*d;
                s=s+k*d;
                }
                d=d*10;
                m/=10;
            }
            n=s;
            binaryprint(n);
            System.out.println(l);
    }
}
