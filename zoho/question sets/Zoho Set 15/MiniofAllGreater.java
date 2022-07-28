import java.util.Scanner;
public class MiniofAllGreater{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l[]=new int[n];
        for(int i=0;i<n;i++)
        l[i]=sc.nextInt();
        minimum(l,n);
        sc.close();
    }
    static void minimum(int l[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int max=Integer.MAX_VALUE;
            for(int j=0;j<n;j++)
            {
                if(l[i]<l[j] && max>l[j])
                {
                    max=l[j];
                }
            }
            if(max!=Integer.MAX_VALUE)
            System.out.print(l[i]+">"+max+" ");
            else
            System.out.print(l[i]+">"+" ");
        }
    }
}