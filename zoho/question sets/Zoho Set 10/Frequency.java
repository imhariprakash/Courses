import java.util.Scanner;
public class Frequency {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(max<a[i])
            max=a[i];
        }
        max++;
        for(int i=0;i<n;i++)
        {
            int c=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j] &&a[i]!=max)
                {
                    c++;
                    a[j]=max;
                }
            }
            if(a[i]!=max)
            System.out.println(a[i]+"-->"+c);
        }
        sc.close();
    }
}
