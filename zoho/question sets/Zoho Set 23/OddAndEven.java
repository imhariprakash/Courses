import java.util.Scanner;
public class OddAndEven {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        addodd(n);
        sc.close();       
    }
    static void addodd(int n)
    {
        int odd=0,even=0;
        while(n>0)
        {
            int k=n%10;
            if(k%2==0)
            even++;
            else
            odd++;
            n/=10;
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
