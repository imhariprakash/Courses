import java.util.Scanner;
public class MatrixDiagonalSum {
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int r=sc.nextInt();
       int c=sc.nextInt();
       int a[][]=new int[r][c];
       for(int i=0;i<r;i++)
       for(int j=0;j<c;j++)
       a[i][j]=sc.nextInt();
       System.out.println(adddiagonal(a,r,c));
       sc.close();
   }
   static int adddiagonal(int a[][],int r,int c)
   {
       int up=0,down=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(r-i-j>=1)
                    up+=a[i][j];
                if(r-i-j<=1)
                down+=a[i][j];
            }
        }
        return(up>down?up:down);
   } 
}
