import java.util.Scanner;
public class PrintwithoutDupliction {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int l=0;
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            int f=0;
            for(int j=0;j<i;j++)
            {
                if(a[j]==k)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            a[l++]=k;
        }
        for(int i=0;i<l;i++)
        System.out.print(a[i]+" ");
        sc.close();
    }
}
