import java.util.Scanner;
public class Threshold {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Threshold value:");
        int thres=sc.nextInt();
        System.out.println(countthreshold(a,thres));
        sc.close();
    }
    static int countthreshold(int a[],int t)
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                int k=a[i]/t;
                count=count+Math.abs(k);
                int l=a[i]%t;
                if(l!=0)
                count++;
            }
        }
        return count;
    }
}
