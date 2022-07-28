public class CheckMtrixRotate {
    public static void main(String[] args)
    {
        int n[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}};
        int a[][]={{3,6,9},
                   {2,5,8},
                   {1,4,7}};
        if(a.length==n.length&& a[0].length==n[0].length)
        {
            if(checknightydegree(a,n))
            {
                System.out.println("90 degree True");
            }
            if(check180(a,n))
            {
                System.out.println("180 degree True");
            }
            if(check270(a,n))
            {
                System.out.println("270 degree True");
            }
        }
    }
    static boolean checknightydegree(int a[][],int n[][])
    {
        int c=a[0].length-1;
        for(int j=c;j>=0;j--)                                                      //a[][]={{3,6,9},
        {                                                                         //        {2,5,8},
            for(int i=0;i<a.length;i++)                                           //        {1,4,7}}
            {
                if(n[i][j]!=a[c-j][i])
                return false;
            }
        }
        return true;
    }
    static boolean check180(int a[][],int n[][])
    {
        int r=a.length-1;                                                      //a[][]={{9,8,7},
        int c=a[0].length-1;                                                 //         {6,5,4},
        for(int i=r;i>=0;i--)                                                 //        {3,2,1}}
        {
            for(int j=c;j>=0;j--)
            {
                if(a[i][j]!=n[r-i][c-j])
                return false;
            }
        }
        return true;
    }
    static boolean check270(int a[][],int n[][])
    {                                                                           
        int r=a.length-1;                                                              //a[][]={{3,6,9},
        for(int i=0;i<=r;i++)                                                           //      {2,5,8},
        {                                                                               //      {1,4,7}}
            for(int j=r;j>=0;j--)
            {
                if(a[j][i]!=n[i][r-j])
                return false;
            }
        }
        return true;
    }
}
