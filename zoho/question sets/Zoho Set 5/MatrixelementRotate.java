public class MatrixelementRotate {
    public static void main(String[] args)
    {
        int a[][]={{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12},
                   {13,14,15,16}};
        rotate(a);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            System.out.print(a[i][j]+"  ");
            System.out.println();
        }
    }
    static void rotate(int a[][])
    {
        int r=0,c=0,row=a.length,col=a[0].length,prev;
        while(r<row && c<col)
        {
            if(r+1==row|| c+1==col)
            break;
           prev=a[r+1][c];
            for(int i=c;i<col;i++)
                prev=swap(prev,a,r,i);
            r++;
            for(int i=r;i<row;i++)
                prev=swap(prev,a,i,col-1);
            col--;
            if(r<row)
            {
                for(int i=col-1;i>=c;i--)
                    prev=swap(prev,a,row-1,i);
            }
            row--;
            if(c<col)
            {
                for(int i=row-1;i>=r;i--)
                    prev=swap(prev,a,i,c);
            }
            c++;
        }
    }
    static int swap(int p,int a[][],int i,int j)
    {
        p=p+a[i][j]-(a[i][j]=p);
        return p;
    }
}
