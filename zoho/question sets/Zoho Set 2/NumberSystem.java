import java.util.Scanner;
public class NumberSystem {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printtheNumbers(n);
        sc.close();
    }
    static void printtheNumbers(int n)
    {
        int i,m=n,digits=0,temp=1,pos;
        for(i=-1;m!=0;i++)
            m=m/2;
        digits=i;
        for(;i>0;i--)
        temp=temp*2;
        pos=n-temp;
        pos++;
        if(digits==0)
        pos=1;
        if(pos==temp)
        {
            pos=0;
            digits++;
        }
        for(int k=digits-1;k>=0;k--)
        {
            System.out.println(k);
            if(((pos>>k)&1)==1)
            {
                System.out.print(4);
            }
            else
            System.out.print(3);
        }
    }
}
