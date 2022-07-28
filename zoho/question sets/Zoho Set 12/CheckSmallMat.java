public class CheckSmallMat {
    public static void main(String[] args)
    {
        int n[][]={{4,5,9},
                   {1,4,5},
                   {8,1,9}};
        int a[][]={{4,5},
                   {1,3}};
        System.out.println(matrix(n,a));
    }
    static boolean matrix(int n[][],int a[][])
    {
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n[i].length;j++)
            {
                if(a[0][0]==n[i][j])
                {
                    if(check(a,n,i,j))
                    return true;
                }
            }
        }
        return false;
    }
    static boolean check(int a[][],int n[][],int i,int j)
    {
        int f=0,r=0,c=0,k,l;
        for(r=0,k=i;k<n.length&&r<a.length;k++,r++)
        {
            for(c=0,l=j;l<n[i].length&& c<a[r].length;l++,c++)
            {
                if(a[r][c]==n[k][l]);
                else
                {
                    f=1;
                    break;
                }
            }
            if(f==1)
            break;
        }
       if(r==a.length&& c==a[r-1].length&&f!=1)
        return true;
        else
        return false;
    }
}
