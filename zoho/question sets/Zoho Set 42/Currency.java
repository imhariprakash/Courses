import java.util.Scanner;
public class Currency{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]={2000,500,200,100,50,20,10,5,2,1};
        int n=sc.nextInt();
        currencycount(n,a);
        sc.close();
    }
    static void currencycount(int n,int a[])
    {
        int i=0;
        while(n>0)
        {
            int k=n/a[i];
            if(k!=0)
            System.out.println(a[i]+" "+k);
            n=n%a[i];
            i++;
        }
    }
}