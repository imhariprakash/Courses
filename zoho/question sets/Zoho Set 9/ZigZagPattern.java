import java.util.Scanner;
public class ZigZagPattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int n[][]=new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            n[i][j]=sc.nextInt();
        }
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            System.out.print(n[i][j]);
            System.out.println();
        }
        ZigZag(n,R,C);
        sc.close();
    }
    static void ZigZag(int n[][],int row,int col)
    {
        int r=0,c=0;
        boolean up=true;
        while(r<row && c<col)
        {
            if(up)
            {
                while(r>0 && c<col-1)
                {
                    System.out.print(n[r][c]+" ");
                    r--;
                    c++;
                }
                System.out.print(n[r][c]+" ");
                if(c==col-1)
                r++;
                else
                c++;
            }
            else
            {
                while(c>0 && r<row-1)
                {
                    System.out.print(n[r][c]+" ");
                    r++;
                    c--;
                }
                System.out.print(n[r][c]+" ");
                if(r==row-1)
                c++;
                else
                r++;
            }
            up=!(up);
        }
    }
}
