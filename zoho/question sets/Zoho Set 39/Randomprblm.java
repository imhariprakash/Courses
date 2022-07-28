import java.util.Scanner;
import java.util.Random;
public class Randomprblm {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            a[i][j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=a[i][0];j<=a[i][1];j++)
            {
                System.out.print(r.nextInt(a[i][1])+1+" ");
            }
            System.out.println();
        }
    }    
}
