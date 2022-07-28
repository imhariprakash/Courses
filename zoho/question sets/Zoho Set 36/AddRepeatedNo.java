import java.util.Scanner;
public class AddRepeatedNo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        addconsecutive(a,n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        sc.close();
    }
    static void addconsecutive(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            if(i<n-1 && a[i]==a[i+1])
            {
                a[i]=a[i]+a[i+1];
                a[i+1]=0;
            }
        }
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                a[k]=a[i];
                if(k!=i)
                a[i]=0;
                k++;
            }
        }
    }

}
