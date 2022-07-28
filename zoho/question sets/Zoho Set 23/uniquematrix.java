import java.util.Scanner;
public class uniquematrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        unique(a,r,c);
        sc.close();
    }
    static void unique(int a[][],int r,int c)
    {
        for(int i=0;i<r;i++)
        {
            int f=0;
            for(int j=0;j<i;j++)
            {
                f=1;
                for(int k=0;k<c;k++)
                {
                    if(a[i][k]!=a[j][k])
                    f=0;
                }
                if(f==1)
                break;
            }
            if(f==0)
            {
                for(int l=0;l<c;l++)
                System.out.print(a[i][l]);
                System.out.println();
            }
        }
    }
}
